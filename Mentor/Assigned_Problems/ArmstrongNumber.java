package mentorAssignment;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("ENTER NUMBER : ");
        int number = in.nextInt();

        System.out.println((isArmstrong(number)) ? "It's an Armstrong Number" : "Not an Armstrong Number");
    }

    private static boolean isArmstrong(int number) {

        int temp = number, digits = 0, x= 0, l = 0, multiplier, r = number;

        while(temp > 0){

            digits++;

            temp /= 10;
        }
        for (int i = 0; i < digits; i++) {

            temp =  (number%10);

            multiplier = temp;

            l = digits;

            while (l-- > 1){

                 multiplier = multiplier * temp;

            }

            x += multiplier;

            number /= 10;
        }
        return x == r;
    }

}
