package mentorAssignment;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ENTER NUMBER : ");
        int number = in.nextInt();

        System.out.println("REVERSE NUMBER : "+reverseNum(number));
    }

    private static int reverseNum(int number) {

        int digit = 0, reverseNumber = 0;

        while(number > 0){
            digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number /= 10;
        }

        return reverseNumber;

    }
}
