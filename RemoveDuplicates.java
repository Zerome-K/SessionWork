import java.util.Scanner;

public class RemoveDuplicates{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int res = 0;
	System.out.print("Enter Array Size : ");
	int size = in.nextInt();
	int[] arr = new int[size];
	for(int j = 0; j < size; j++) arr[j] = in.nextInt();
	for(int i = 0; i<size; i++) res = res ^ arr[i];
	System.out.println("Non Duplicate Number : " + res);
	in.close();
	}
}