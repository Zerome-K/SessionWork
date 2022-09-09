package arrays;

import java.util.Scanner;

public class Weightage {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Enter Array Size : ");
		
		int size = in.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) arr[i] = in.nextInt();
		
		weightAge(arr);
		
		in.close();
	}

	private static void weightAge(int[] arr) {
		
		int weight = 0;
		
		int[][] res = new int[arr.length][2];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] % 2 == 0) weight += 3;
			
			if(arr[i] % 4 == 0 && arr[i] % 6 == 0) weight += 4;
			
			int isSquare = arr[i] % 10;
			
			if(!(isSquare == 2 || isSquare == 3 || isSquare == 7 || isSquare == 8 ||isSquare == 0)){
				
				weight += 5;
				
			}
			
			res[i][0] = arr[i];
			
			res[i][1] = weight;
			
			weight = 0;
		}
		
		res = weightAgeSort(res);
		
		for(int[] x : res) System.out.print("<" + x[0] + "," +x[1] + "> ");
		
	}

	private static int[][] weightAgeSort(int[][] res) {
		
		for(int i = 0 ; i < res.length; i++) {
			
			for(int j = 0; j < res.length-1-i; j++) {
				
				if(res[j][1] <= res[j+1][1]) {
					
					int[] temp = res[j];
					
					res[j] = res[j + 1];
					
					res[j+1] = temp;
				}
			}
		}
		
		return res;
	}

}
