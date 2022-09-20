package mentorAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateCharactersInString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("ENTER STRING : ");
        String str = in.next();
        ArrayList<Character> res = duplicate(str);
        System.out.print("\nDUPLICATE CHARACTERS : " + res);
    }

    private static ArrayList<Character> duplicate(String str){
        int[] table = new int[26];
        for(int i = 0; i < str.length(); i++){
            table[((int)str.charAt(i)) - 97]++ ;
        }
        ArrayList <Character> l = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (table[i] > 1) l.add((char) (97 + i));
        }
        return l;
    }
}
