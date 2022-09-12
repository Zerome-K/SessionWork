package arrays;

import java.util.Arrays;

public class BlockSwap {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
		BlockSwapRotate(arr,0, 2, 9);
		
		System.out.println(Arrays.toString(arr));	}

	
	static void BlockSwapRotate(int arr[],int idx, int rotate, int n) {
		
		
		if(rotate == 0 || rotate == n) return;
		
		int A_len = rotate, B_len = n-rotate; 
		
		while(!(A_len == B_len)) {
			
			if(A_len < B_len) {
				
				swap(arr, rotate - A_len,  B_len , A_len);
				B_len -= A_len;
				
			}else {
				
				swap(arr, rotate - A_len , rotate , B_len);
				A_len -= B_len;
				
			}
		}
		swap(arr, rotate - A_len, rotate, A_len);
	}

		
		
	

	private static void swap(int[] arr, int A_start, int B_start, int d){
		
		int temp, i;
		
		for(i = 0; i < d; i++) {
			
			temp = arr[A_start + i];
			
			arr[A_start + i] = arr[B_start + i];
			
			arr[B_start + i] = temp;
		}
	}

}
