package cricket_score;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" -- MATCH BEGINS -- ");
        System.out.print("\nENTER OVERS : ");
        int overs = in.nextInt();
        Ground play = new Ground(overs);
        play.start();
    }
}
