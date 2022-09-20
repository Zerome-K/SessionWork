package mentorAssignment;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = in.nextInt();

        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {

        if(number <= 3 && number > 1) return true;

        int start = 5, bound = (int) Math.sqrt(number);

        if(number % 2 == 0 || number % 3 == 0) return false;

        while(start <= bound){

            if(!(number % start == 0) || !(number % (start + 2) == 0)){
                start += 6;
                continue;
            }
            return false;
        }
        return true;
    }
}
