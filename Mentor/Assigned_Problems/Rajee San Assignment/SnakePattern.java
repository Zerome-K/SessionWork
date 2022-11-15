package rajeesanassignment;

import java.util.Scanner;
public class SnakePattern {

    public static void main(String[] args) {
        SnakePattern snakePattern = new SnakePattern();
        snakePattern.init();
    }

    private void init() {
        System.out.print("ENTER ROWs COUNT : ");
        int rows = new Scanner(System.in).nextInt();
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int k = rows - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < rows; j++) {
                if (i % 2 == 0)
                    System.out.print((number++) + " ");
                else
                    System.out.print((number--) + " ");
            }
            if (i % 2 == 0)
                number += rows - 1;
            else
                number += rows + 1;
            System.out.println();
        }
    }
}