package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeGreaterSmaller {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int size = in.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.printf("Enter Array Value %d : \n", i+1);
			arr[i] = in.nextInt();
			
		}

		Arrays.sort(arr);
		
		arrange(arr);
		
		System.out.println("ReArranged Array : " + Arrays.toString(arr));
		
		in.close();
	}
	
	public static void arrange(int[] arr) {
		
		int mid = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i%2 == 1) {
				
				mid = ((arr.length-1) + i + 1) / 2;
				
			}else mid = ((arr.length-1) + i) / 2;
			
			int temp = arr[mid];
			
			for(int j = mid-1 ; j >= i; j--) {
				
				arr[j + 1] = arr[j];
				
			}
			
			arr[i] = temp;
			
		}
	}

}
