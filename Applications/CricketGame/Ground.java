package cricket_score;

import java.util.Random;
import java.util.Scanner;

public class Ground {

    Random rand  = new Random();
    Scanner in = new Scanner(System.in);

    int[][] userOver;
    int[][] compOver;

    Team team ;

    int usertotal, ballsRemaining, comptotal, wicket;

    Ground(int over){

        this.userOver = new int[over][6];
        this.compOver = new int[over][6];
        this.ballsRemaining = 6 * over;
    }

    public void start(){

        System.out.println("1 --> SELECT TEAM / 2 --> CREATE TEAM");

        int x = in.nextInt();

        Player[] members = getTeamPlayers(x,true);

        int playerIdx = 0, round = 0, compIdx = 0;

        Player[] opponents = getTeamPlayers(1,false);

        boolean flag = this.toss();

        while(round++ < 2) {

            int br = this.ballsRemaining;

            System.out.println((flag)? "\n-- BATTING --\n" : "\n-- BOWLING --\n");

            for (int i = 1; i <= this.userOver.length * 6; i++) {

                System.out.print((flag) ? "HIT : " : "BOWl : ");

                int hit = in.nextInt();

                int comp = this.rand.nextInt(7);

                if (flag) {

                    if (comp == hit || comp == 0) {
                        System.out.println("+-------------------+");
                        System.out.println("|------  OUT  ------|");
                        System.out.println("|"+ Ground.centerString(10,members[playerIdx].name) + "|" + Ground.centerString(8,String.valueOf(members[playerIdx].currentRuns)) + "|");
                        System.out.println("+-------------------+");

                        members[playerIdx].totalRuns += members[playerIdx].currentRuns;
                        playerIdx++;

                        this.userOver[(i-1) / 6][(i-1) % 6] = -1;
                        this.wicket++;

                    } else {

                        this.userOver[(i-1) / 6][(i-1) % 6] = hit;

                        members[playerIdx].currentRuns += hit;

                        this.usertotal += hit;

                    }

                    this.ballsRemaining--;

                    if ((i % 6 == 0)) {
                        this.scoreboard(this.usertotal,members[playerIdx].name,i/6, this.ballsRemaining, flag);
                        System.out.println();
                    }

                } else {

                    if (comp == hit || comp == 0) {

                        System.out.println("\n+-------------------+");
                        System.out.println("|-----  WICKET -----|");
                        System.out.println("|"+ Ground.centerString(10,opponents[compIdx].name) + "|" + Ground.centerString(8,String.valueOf(opponents[compIdx].currentRuns)) + "|");
                        System.out.println("+-------------------+");

                        opponents[compIdx].totalRuns += opponents[compIdx].currentRuns;

                        compIdx++;

                        this.compOver[(i-1) / 6][(i-1) % 6] = -1;

                        this.wicket++;

                    } else {

                        this.compOver[(i-1) / 6][(i-1) % 6] = hit;

                        opponents[compIdx].currentRuns += hit;

                        this.comptotal += hit;

                    }

                    this.ballsRemaining--;

                    if ((i % 6 == 0)) {
                        this.scoreboard(this.comptotal, opponents[playerIdx].name,(i/6), this.ballsRemaining, flag);
                        System.out.println();
                    }

                }


                if (wicket == 11) {

                    this.wicket = 0;

                    flag = !flag;

                    System.out.println("-- ALL OUT --");

                    break;
                }

            }
            flag = !flag;

            this.wicket = 0;

            this.ballsRemaining = br;
        }
        System.out.println("YOUR SCORE : " + this.usertotal + "          |  COMPUTER SCORE : " + this.comptotal);
        System.out.println("+-----------------------------------------------+");
        if(this.usertotal > this.comptotal) System.out.println("        \\\\\\\\\\  YOU WON  /////");
        else System.out.println("        \\\\\\\\\\  YOU LOSE  /////");
        System.out.println("+-----------------------------------------------+");
        System.out.println("\nDO YOU WANNA SEE MATCH SUMMARY 1.YES \\ 2.NO");

        int sum = in.nextInt();

        if(sum == 1) matchSummary(true);

        else System.out.println("THANK YOU");
    }

    public void matchSummary(boolean b){

        for (int i = 0; i < 2; i++) {

            System.out.println("+---------------------------------+" + ((b) ? "\nPLAYER" : "\nCOMPUTER"));

            for (int j = 0; j < this.userOver.length; j++) {

                System.out.println((b)? "USER OVERS : " : "COMPUTER OVERS :");
                System.out.print("Over : " + (j + 1) + " : [ ");
                for (int k = 0; k < 6; k++) {
                    int a = (b) ? this.compOver[j][k] : this.userOver[j][k];
                    System.out.print(((a < 0) ? "W" : a) + ",");
                }
                System.out.println("]");
            }
            System.out.println();
            System.out.println("TOTAL RUNS : " + ((b) ? this.usertotal : this.comptotal));
            b = !b;
            System.out.println("+--------------------------------+");
        }



    }

    boolean toss(){

        int h = 1;//1 + (int)(Math.random() * ((3 - 1) + 1));
        System.out.println("CHOOSE : 1 --> HEAD / 2 --> TAILS");
        int t = in.nextInt();
        return (t == h || t > 1);
    }
    public Player[] getTeamPlayers(int selection, boolean flag) {

        if (selection == 1) {

            System.out.println((flag) ? "SELECT TEAM : 1--> CSK / 2--> MI / 3--> RCB :" : "");
            int select;
            if(flag) {
                select = in.nextInt();
            }else {
                select =  (int) ((Math.random() * (3 - 1)) + 1);
            }
            if(select == 1) {

                this.team = new Team("CSK");
                return this.team.csk;

            } else if (select == 2) {

                this.team = new Team("MI");
                return this.team.mi;

            }else if (select == 3) {
                this.team = new Team("RCB");
                return this.team.rcb;
            }
        }
        Team getTeam = new Team();
        return getTeam.self;
    }

    public static String centerString (int width, String s) {
        return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }
    public void scoreboard(int runs, String name, int over, int ballsRemaining, boolean b){
        System.out.println("+-----------------------------------------------+");
        System.out.printf("|" + centerString(15,"RUNS") +"|" + centerString(15,"OVER") + "|" + centerString(15,"WICKETS")+ "|");
        System.out.println("\n   - - - - - -     - - - - - -     - - - - - -");
        System.out.printf("|" + centerString(15,String.valueOf(runs)) +"|" + centerString(15,String.valueOf(over)) + "|" + centerString(15,String.valueOf(this.wicket))+ "|");
        System.out.print("\n+-----------------------------------------------+");
        System.out.print("\n+-----------------------------------------------+");
        System.out.printf("\n|" + centerString(15,"STRIKER") +"|" + centerString(15,"TARGET") + "|" + centerString(15,"BALLS REMAINING")+ "|");
        System.out.println("\n   - - - - - -     - - - - - -     - - - - - -");
        System.out.printf("|" + centerString(15,name) +"|" + centerString(15,(!b)? "0" : String.valueOf(this.comptotal)) + "|" + centerString(15,String.valueOf(ballsRemaining))+ "|");
        System.out.print("\n+-----------------------------------------------+");
    }
}
