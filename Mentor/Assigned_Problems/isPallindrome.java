package mentorAssignment;

import java.util.Scanner;

public class isPallindrome {

    static boolean pallindrome(String s){
        int i = 0, j = s.length()-1;

        while(i++ <= j--){
            if(!(s.charAt(i) == s.charAt(j))) return false;

        }
        return true;
    }
    static boolean pallindrome(int a){
        int temp = a, digit = 0 ,rev = 0;

        while(temp > 0){
            digit = temp % 10;
            rev = (rev * 10) + digit;
            temp /= 10;
        }
        return rev == a;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to check is a Pallindrome : ");
        int num = in.nextInt();

        System.out.print("Enter Sentence to check for Pallindrome : ");
        String word = in.next();

        System.out.println("Given Number : " + pallindrome(num) + " / Given String : " + pallindrome(word));
    }
}
