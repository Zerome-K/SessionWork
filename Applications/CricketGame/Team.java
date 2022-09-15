package cricket_score;

import java.util.Scanner;

public class Team {

    Scanner in = new Scanner(System.in);
    Player[] self = new Player[11];
    Player[] csk = {new Player("Dhoni", "Captain"), new Player("Jadeja", "All Rounder"),
                    new Player("Raina", "All Rounder"),new Player("Bravo", "Bowler"),
                    new Player("Kholi", "BatsMan"),new Player("SKY", "BatsMan"),
                    new Player("Shewag", "Batsman"), new Player("Pandya", "All Rounder"),
                    new Player("Zerome", "BatsMan"),new Player("Rohit", "Vice_CAptain"),new Player("Sachin", "BatsMan")};

    Player[] mi = {new Player("Rohit", "Captain"), new Player("HARDIK", "All Rounder"),
            new Player("Harbhajan", "All Rounder"),new Player("Butler", "Bowler"),
            new Player("Pollard", "BatsMan"),new Player("HariPrasath", "BatsMan"),
            new Player("Taylor", "Batsman"), new Player("Warner", "All Rounder"),
            new Player("Zerome", "BatsMan"),new Player("Shewag", "Vice_CAptain"),new Player("MaxWell", "BatsMan")};

    Player[] rcb= {new Player("Kohli", "Captain"), new Player("ABD", "All Rounder"),
            new Player("Chahal", "All Rounder"),new Player("Bumrah", "Bowler"),
            new Player("Stonis", "BatsMan"),new Player("HariPrasath", "BatsMan"),
            new Player("Gayle", "Batsman"), new Player("Ricky", "All Rounder"),
            new Player("Chris", "BatsMan"),new Player("Warner", "Vice_CAptain"),new Player("MaxWell", "BatsMan")};
    String name;
     Team() {

         this.getplayer();
    }

    Team(String name){

         this.name = name;

         this.self = csk;
    }

    void getplayer(){

        System.out.println("Enter Team Name :");

        name = in.next();

        for (int i = 0; i < 11; i++) {

            System.out.println("Enter Player Name :");

            String name = in.next();

            System.out.println("Enter Position :");

            String pos = in.next();

            this.self[i] = new Player(name, pos);
        }
    }

    public void printPlayer(){

        for (Player x : this.self){

            System.out.println(x);

            System.out.println();
        }
    }

    @Override
    public String toString(){

         System.out.printf("Team : " + this.name);

         System.out.print(" Players : ");

         this.printPlayer();

         return "";
     }
    }
