package arrays;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ENTER ROWS : ");
		int row = in.nextInt();
		
		System.out.println("ENTER COLUMNS : ");
		int col = in.nextInt();
		
		int[][] arr = new int [row][col];
		
		for(int i = 0; i<row; i++) {
			for(int j =0; j <col; j++) arr[i][j] = in.nextInt();
		}
		in.close();
		
		printSpiral(arr);

	}

	private static void printSpiral(int[][] arr) {
		
		System.out.println("-- SPIRAL MATRIX --");
		
		int top = 0, down = arr.length-1, left = 0, right = arr[0].length-1, k;
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length * 2; i++) {
			
			if( i % 2 == 0 && flag) {
				
				for(k = left; k <= right; k++) System.out.print(arr[top][k] + ",");
				
				top += 1;
				
				flag = !flag;
				
			}else if( i % 2 == 1 && !flag) {
				
				for(k = top; k <= down; k++) System.out.print(arr[k][right] + ",");
				
				right -= 1;
			
			}else if(i % 2 == 0 && !flag) {
				
				for(k = right; k >= left; k--) System.out.print(arr[down][k] + ",");
				
				down -= 1;
				
				flag = !flag;
				
			}else {
				
				for(k = down; k >= top; k--) System.out.print(arr[k][left] + ",");
				
				left += 1;
			}
		}
		
	}

}
