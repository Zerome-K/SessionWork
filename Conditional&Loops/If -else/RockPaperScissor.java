package assignments;

import java.util.Scanner;

public class RockPaperScissor {

	public static String winner(int p1, int p2) {
		
		if(p1 == 1){
			
			if(p2 == 2) return "-- PLAYER 2 WINS --";
			
			else if(p2 == 3) return "-- PLAYER 1 WINS --";
			
			else return "MATCH DRAW !";
		
		}else if(p1 == 2){
			
			if(p2 == 1) return "-- PLAYER 1 WINS --";
			
			else if (p2 == 3) return "-- PLAYER 2 WINS --";
			
			else return "MATCH DRAW !";
		
		}else{
			
			if(p2 == 1) return "-- PLAYER 2 WINS --";
			
			else if (p2 == 2) return "-- PLAYER 1 WINS --";
			
			else return "MATCH DRAW !";
		}
	
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number Of Rounds --> ");
		
		int rounds = in.nextInt();
		
		System.out.println("CHOOSE < 1 for Rock | 2 for Paper | 3 for Scissor >");
		
		while(rounds-- > 0) {
			
			System.out.print("Player 1 -> ");
			
			int p1 = in.nextInt(); 	
			
			System.out.print("Player 2 -> ");
			
			int p2 = in.nextInt();
			
			if((p1 < 1 || p1 > 3) || (p2 < 1 || p2 > 3)){
				
				System.out.println("ENTER VALID NUMBER 1/2/3");
				
				rounds++;
				
				continue;
				
			}
			
			System.out.println(winner(p1, p2));
			
		}
		
		in.close();

	}

	public static String winner(int p1, int p2) {
		
		if(p1 == 1){
			
			if(p2 == 2) return "-- PLAYER 2 WINS --";
			
			else if(p2 == 3) return "-- PLAYER 1 WINS --";
			
			else return "MATCH DRAW !";
		
		}else if(p1 == 2){
			
			if(p2 == 1) return "-- PLAYER 1 WINS --";
			
			else if (p2 == 3) return "-- PLAYER 2 WINS --";
			
			else return "MATCH DRAW !";
		
		}else{
			
			if(p2 == 1) return "-- PLAYER 2 WINS --";
			
			else if (p2 == 2) return "-- PLAYER 1 WINS --";
			
			else return "MATCH DRAW !";
		}
	
	}

}
