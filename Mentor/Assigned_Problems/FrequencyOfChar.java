package mentorAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> freq = new HashMap<>();
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
             freq.put(c,freq.getOrDefault(c,0)+1);
        }

        System.out.println(freq);
    }
}
