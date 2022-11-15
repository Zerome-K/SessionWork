package rajeesanassignment;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {

    private final Scanner scanner = new Scanner(System.in);

    public void init(){
        System.out.println("ENTER NUMBER OF ROWS : ");
        int rows = scanner.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS : ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns;j++)matrix[i][j] = scanner.nextInt();
        }
        transpose(matrix);
        for (int[] arr:matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        reverse(matrix);
    }
    private void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.init();
    }
}
