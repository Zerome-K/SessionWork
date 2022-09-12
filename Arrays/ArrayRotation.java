/*
	1. Getting Array Size and Values.
	2. get rotation Direction and Rotate Times.
	3. Store arr[0] to arr[times] in anothher array,
		-> Shift Arr[times] to arr[n-1] -> arr[0] as Starting position;
	4.Finally add auxillary array next to shifted array values.
	
	Functions : rotateRight, rotateLeft;

*/

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.printf("Enter Array Value %d : \n", i+1);
			arr[i] = input.nextInt();
			
		}
		System.out.println("Enter Rotate Steps : ");
		int rot = input.nextInt();
		
		System.out.println("Enter Direction Right/Left: ");
		String dir = input.next().toLowerCase();
		
		if(dir.equals("right")) arr = rotateRight(arr, rot);
		else arr = rotateLeft(arr, rot);
		
		
		System.out.println(Arrays.toString(arr));
		
		input.close();

	}
	// Array Rotate Left
	private static int[] rotateLeft(int[] arr, int d) {
		
		int[] rotated = new int[arr.length];
		
		int idx = 0;
		
		for(int i = d; i < arr.length; i++) {
			
			rotated[idx] = arr[i];
			
			idx++;
		}
		
		for(int i =0; i<d; i++) {
			
			rotated[idx] = arr[i];
			
			idx++;
		}
		
		return rotated;
		
	}
	// Array Rotate Right
	private static int[] rotateRight(int[] arr, int d) {
		
		int[] rotated = new int[arr.length];
		
		int idx = 0;
		
		for(int i = arr.length-d; i < arr.length; i++) {
			
			rotated[idx] = arr[i];
			
			idx++;
		}
		
		for(int i =0; i< arr.length-d; i++) {
			
			rotated[idx] = arr[i];
			
			idx++;
		}
		return rotated;
	}
}
