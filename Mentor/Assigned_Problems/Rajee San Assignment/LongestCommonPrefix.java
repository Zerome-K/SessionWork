package rajeesanassignment;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF STRINGS : ");
        int size = scanner.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) words[i] = scanner.next();
        System.out.println("Longest Prefix : " + findPrefix(words));
    }

    private String findPrefix(String[] words) {
        if(words.length == 0) return "";
        String prefix = words[0];
        for (int idx = 1; idx < words.length; idx++) {
            while(words[idx].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
