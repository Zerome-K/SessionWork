package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Matrix-1 Rows : ");
		int rowOf1 = in.nextInt();
		
		System.out.println("Enter Matrix-1 Columns : ");
		int colOf1 = in.nextInt();
		
		System.out.println("Enter Matrix-2 Rows : ");
		int rowOf2 = in.nextInt();
		
		System.out.println("Enter Matrix-2 Columns : ");
		int colOf2 = in.nextInt();
		
		int[][] arr1 = new int[rowOf1][colOf1];
		
		int[][] arr2 = new int[rowOf2][colOf2];
		
		
		for(int row = 0 ; row < rowOf1 ; row++) {
			
			for(int col = 0; col < colOf1 ; col++) {
				
				System.out.printf("Enter 1st Matrix's %dth Row & %dth Column : \n", row, col);
				arr1[row][col] = in.nextInt();
				
			}
		}
		
		for(int row = 0 ; row < rowOf2 ; row++) {
			
			for(int col = 0; col < colOf2 ; col++) {
				
				System.out.printf("Enter 2nd Matrix's %dth Row & %dth Column : \n", row, col);
				arr2[row][col] = in.nextInt();
				
			}
		}
		
		in.close();
		
		int[][] ans = matrixMultiply(arr1, arr2);
		
		System.out.println("---Answer---");
		for(int[] x : ans)System.out.println(Arrays.toString(x));
		
	}
	
	public static int[][] matrixMultiply(int[][] mat1, int[][] mat2){
		
		int row , col;
		
		row = mat1.length;
		
		col = mat2[0].length;
		
		int[][] result = new int[row][col];
		
		for(int k = 0; k < mat1.length ; k++) {
			
			for(int j = 0 ; j < mat2[0].length; j++) {
				
				int total = 0;
				
				for(int i = 0; i < mat1[0].length ; i++) {
					
					int res = mat1[k][i] * mat2[i][j];
					
					total += res;
				}
				
				result[k][j] = total;
				
			}
		}
		
		return result;
		
	}
}
