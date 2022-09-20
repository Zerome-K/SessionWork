package mentorAssignment;

import java.util.Scanner;

public class RemoveSpace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        System.out.println("SPACE REMOVED STRING : "+removeMethod(s));
    }

    private static String removeMethod(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(! (s.charAt(i) == ' ')) sb.append(s.charAt(i));
        }

        return sb.toString();

    }
}
