import java.util.Scanner;

public class TikTak{

    public static void display(char[] arr){
	System.out.println("---------------------");
    	int i = 0;
        	while(i < arr.length){
            		for(int j=0; j<3 ; j++){
                			System.out.print(" | " + arr[i] + " | ");
                			i++;
            		}
            	System.out.println("\n---------------------");
        	}
    }

   public static char check(char[] arr){
	if((arr[0] == arr[1]) && (arr[0] == arr[2])){
	return arr[0];
	}else if((arr[0] == arr[3]) && (arr[0] == arr[6])){
	return arr[0];
	}else if((arr[0] == arr[4]) && (arr[0] == arr[8])){
	return arr[0];
	}else if((arr[1] == arr[5]) && (arr[1] == arr[7])){
	return arr[1];
	}else if((arr[2] == arr[4]) && (arr[2] == arr[6])){
	return arr[2];
	}else if((arr[2] == arr[5]) && (arr[2] == arr[8])){
	return arr[2];
	}else if((arr[3] == arr[4]) && (arr[3] == arr[5])){
	return arr[3];
	}else if((arr[6] == arr[7]) && (arr[6] == arr[8])){
	return arr[6];
	}else return 'n';
    }
    public static int mark(char[] arr, int pos, boolean flag){
        	if(arr[pos-1] == '\u0000'){
            		if(flag) arr[pos-1] = 'X';
            		else arr[pos-1] = 'O';
		return 1;
        	}else {
	System.out.println("Taken! RE-Enter");
	return 0;
	}
    }
    public static void main(String[] args){
	char[] platform = new char[9];
	Scanner in = new Scanner(System.in);
	System.out.println("\nPlayer 1 : 'X'  Player 2 : 'O'");
	int rounds = 1;
	boolean turn = true; 
	while(rounds <= 9){
		if(turn){
		System.out.println("Enter Position Player 1 :");
		}else {
		System.out.println("Enter Position Player 2 :");
		}
		int res = 0;
		while( res ==  0){
			int pos = in.nextInt();
			res = mark(platform, pos, turn);
		}
		if(rounds > 4){
		char match = check(platform);
		if(match == 'X' || match == 'O'){
			display(platform);
			System.out.printf("|--Player %c Wins--|", match);
			break;
		}
		}
		display(platform);
		turn = !turn;
		rounds++;
	}
    }
}



