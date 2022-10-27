package tiresome;

import java.util.HashMap;
import java.util.Scanner;

public class PatternSearch {

    public static void main(String[] args) {

        Solution matcher = new Solution();

        Solution.init();

    }
}
class Solution {

    public static void mapping(String txt, String pat) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < pat.length(); i++) map.put(pat.charAt(i), map.getOrDefault(pat.charAt(i), 0) + 1);

        System.out.println(map);

        helper(0, map, txt, pat.length());
    }

    private static void helper(int start, HashMap<Character, Integer> map, String txt, int length) {

        if (start > txt.length() - length) return;

        int count = 0;

        HashMap<Character, Integer> local = new HashMap<>(map);

        for (int i = start; i < start + length; i++) {

            if (local.containsKey(txt.charAt(i)) && local.get(txt.charAt(i)) > 0) {

                local.put(txt.charAt(i), local.get(txt.charAt(i)) - 1);

                count++;

            }
        }

        if (count == length) System.out.println(start);

        helper(start + 1, map, txt, length);

    }

    public static void init() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER STRING : ");
        String text = scanner.next();

        System.out.print("ENTER PATTERN : ");
        String pattern = scanner.next();

        mapping(text, pattern);

    }
}
