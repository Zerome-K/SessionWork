package arrays;

import java.util.Scanner;

public class GrandChildren {


	public static void main(String[] args) {
		
		String[][] array = {{"luke", "shaw"}, {"wayne", "rooney"},{"rooney", "ronaldo"}, {"shaw", "rooney"}};
		
		Scanner in = new Scanner(System.in);
		
		String grandFather = in.next();
		
		int ans = getGrandChildren(array, grandFather);
		
		System.out.println("Total GrandChildrens : " + ans);
		
		in.close();

	}

	public static int getGrandChildren(String[][] arr, String gf) {
		
		int count = 0;
		
		String son = null;
		
		for(int i = 0; i <arr.length ; i++) {
			
			if(arr[i][1].equals(gf)) {
				
				son = arr[i][0];
				
			}
		}
		
		for(int j = 0; j <arr.length; j++) {
			
			if(arr[j][1] == son) count++;
		}
		
		return count;
	}

}
