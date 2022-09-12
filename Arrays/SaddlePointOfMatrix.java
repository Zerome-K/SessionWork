package Array;

import java.util.Scanner;

public class SaddlePointOfMatrix {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Matrix-1 Rows : ");
        int rowOf1 = in.nextInt();

        System.out.print("Enter Matrix-1 Columns : ");
        int colOf1 = in.nextInt();

        int[][] a = new int[rowOf1][colOf1];

        for(int row = 0 ; row < rowOf1 ; row++) {

            for(int col = 0; col < colOf1 ; col++) {

                System.out.printf("Enter 1st Matrix's %dth Row & %dth Column : \n", row, col);
                a[row][col] = in.nextInt();
            }
        }
        System.out.println("SADDLE VALUES : " + saddlePoint(a));
    }

    public static String saddlePoint(int[][] a){

        int[][] mn = minAndMax(a, true);
        int[][] nm = minAndMax(a, false);

        StringBuilder sb = new StringBuilder();

        for (int[] ints : mn) {

            int mini = ints[0], maxi = ints[1];

            for (int[] value : nm) {

                if (mini == value[1]) sb.append(mini).append(",");
                if (maxi == value[0]) sb.append(maxi).append(",");

            }
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    private static int[][] minAndMax(int[][] arr, boolean flag) {

        int row = arr.length, col = arr[0].length, temp, max , min, toggle = 1;

        if(!flag){

            temp = row;
            row = col;
            col = temp;
        }

        int[][] min_max = new int[row][2];

        for (int i = 0; i < row; i++) {

            if(flag) {
                max = arr[i][0];
                min = arr[i][0] * -1;

            }else {
                max = arr[0][i];
                min = arr[0][i] * -1;
            }

            for (int j = 1; j < col; j++) {

                if (flag && arr[i][j] * toggle > max) {

                    max = arr[i][j];

                } else if ( !flag && arr[j][i] * toggle > max) max = arr[j][i];

                toggle *= -1;

                if (flag && arr[i][j] * toggle > min ) min = arr[i][j];
                else if(!flag && arr[j][i] * toggle > min) min = arr[j][i];

                toggle *= -1;
            }

            min_max[i][0] = Math.abs(min);
            min_max[i][1] = max;
        }

        return min_max;

    }
}