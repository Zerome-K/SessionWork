/*
	-- Matrix Rotation --
	
	--> Getting Matrix Size and Values
	--> 1. Transpose the Matrix 
		-> Changing Rows -> Columns || Columns -> Rows
	--> 2. Reverse the Matrix 
		-> If Clockwise (Reverse Rows Values) else (Reverse Cols Values)
	--> 3. Getting Rotation Degrees
		->Values are Multiplier of 90 -(180, 270, 360);
		-> Divide Degree with 90 and obtain Quotient,
	--> 4. Repeat Transpose and Reverse Process (Degree / 90) times.
*/

package arrays;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

//		Getting Matrix Size
		System.out.print("--ENTER MATRIX SIZE-- : ");
		int size = in.nextInt();
		
		
		int[][] arr = new int[size][size];
		
//		Getting Matrix Values
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j <size; j++) {
				
				System.out.print("Enter Values : ");
				
				arr[i][j] = in.nextInt();
			}
		}

//		Getting Rotation Degrees and Rotation Option ClockWise/Anti CW --
		
		System.out.println("ENTER ROTATION DEGREE - 90/180/270/360 : ");
		int degree = in.nextInt();
		System.out.println("CLOCKWISE - Y/N : ");
		String wise = in.next().toLowerCase();
		
		for(int i = 0; i < degree / 90; i++) {

			transpose(arr);
			
			reverse(arr,(wise.equals("y") ? true : false));
			
		}
		
		display(arr);
		
		in.close();
	}
	
	
private static void display(int[][] arr) {
		
		System.out.println("-- RESULT --");
		
		for(int i = 0; i < arr.length; i++){
			
			for(int j = 0; j < arr[i].length; j++){
				
				System.out.print(arr[i][j] + " ");
				
			}
			
			System.out.println();
		}
	}
	
	//if flag == true -> Reverse Rows -> else Reverse Columns;
	private static void reverse(int[][] arr, boolean flag) {
		
		if(flag) {
			
			for(int i = 0; i < arr.length; i++) {
			
				for(int j = 0; j < arr[i].length / 2; j++) {
					
					int temp = arr[i][j];
				
					arr[i][j] = arr[i][arr[i].length-j-1];
				
					arr[i][arr[i].length-j-1] = temp;
				}
			}
			
		}else{
			
			for(int i = 0; i < arr.length / 2; i++) {
			
				for(int j = 0; j < arr[0].length; j++) {
				
					int temp = arr[i][j];
				
					arr[i][j] = arr[arr.length-1-i][j];
				
					arr[arr.length-1-i][j] = temp;
				}
			}
		}
	}
	// Changing Rows -> Columns || Columns -> Rows
	private static void transpose(int[][] arr) {
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = row; col < arr.length; col++) {
				
				int temp = arr[row][col];
				
				arr[row][col] = arr[col][row];
				
				arr[col][row] = temp;			
			}
		}
	}

}
