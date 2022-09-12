/* Matrix Addition , Subraction, Scalar Multiply ;
        
       Get Operations and Perform;
       
       option 1 : performs Adddition
       option 2 : Performs Subraction
       option 3 : Scalar Multiply --> Get Multiplier and Select Matrix and then Multiply with Multiplier.
       
       4 Functions : Addition, Subtraction, Scalar Multiplication, Display (matrix displaying):

*/

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Matrix-1 Rows : ");
        int rowOf1 = in.nextInt();

        System.out.print("Enter Matrix-1 Columns : ");
        int colOf1 = in.nextInt();

        System.out.print("Enter Matrix-2 Rows : ");
        int rowOf2 = in.nextInt();

        System.out.print("Enter Matrix-2 Columns : ");
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
        
        /* Operations Selection*/
        
        System.out.print("ENTER OPERATIONS 1-ADD / 2-SUB / 3-SCALAR_MULTIPLY : ");
        int op = in.nextInt();
        if(op == 1) display((matrixAdd(arr1, arr2)));
        else if (op == 2)  display((matrixSub(arr1, arr2)));
        else {
            System.out.println("ENTER SCALAR MULTIPLIER : ");
            int a = in.nextInt();

            System.out.println("MATRIX A / B :");
            char c = in.next().toLowerCase().charAt(0);

            if ((c == 'a')) {
                display((scalarMultiply(arr1, a)));
            } else {
                display((scalarMultiply(arr2, a)));
            }

        }

        in.close();

    }

    public static void display(int[][] ans ){

        System.out.println("---Answer---");
        for(int[] x : ans)System.out.println(Arrays.toString(x));
    }

    public static int[][] matrixAdd(int[][] mat1, int[][] mat2){

        int row , col;

        row = mat1.length;

        col = mat2[0].length;

        int[][] result = new int[row][col];

        for(int i = 0; i < row; i++){

            for(int j = 0; j < col; j++) result[i][j] = mat1[i][j] + mat2[i][j];
        }
        return result;
    }

    public static int[][] matrixSub(int[][] mat1, int[][] mat2){

        int row , col;

        row = mat1.length;

        col = mat1[0].length;

        int[][] result = new int[row][col];

        for(int i = 0; i < row; i++){

            for(int j = 0; j < col; j++) result[i][j] = mat1[i][j] - mat2[i][j];
        }

        return result;
    }

    public static int[][] scalarMultiply(int[][] matrix, int a){

        int[][] res = new int[matrix.length][matrix[0].length];

        for(int i=0; i< matrix.length; i++){

            for(int j=0; j < matrix[0].length; j++) res[i][j] = a * matrix[i][j];
        }

        return res;

    }
}
