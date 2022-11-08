package tiresome;

import java.util.Arrays;
import java.util.Scanner;

public class PushSeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Getting Input Size & Input
        System.out.print("ENTER ARRAY SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();

        //Passing Array to PushSevenLast Method
        PushSeven pushSeven = new PushSeven();
        pushSeven.pushSevenLast(arr);

        System.out.println(Arrays.toString(arr));
    }

    private  void pushSevenLast(int[] arr) {
        int mark = -1,idx;
        for (idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != 7 && arr[++mark] == 7) {
                arr[mark] = arr[idx];
                arr[idx] = 7;
            }
        }
    }
}

//Examples :
//Input : {1, 9, 8, 4, 7, 7, 2, 0, 7, 6, 7}
//Output : {1, 9, 8, 4, 2, 0, 6, 7, 7, 7, 7}.
//Input : {3, 7, 3, 7, 3, 7, 3, 7}
//Output : {3, 3 , 3 , 3, 7, 7, 7, 7}