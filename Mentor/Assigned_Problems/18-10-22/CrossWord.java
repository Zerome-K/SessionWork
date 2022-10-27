package mentorAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CrossWord {

    public char[][] solver(int origin, char[][] puzzle, List<String> words) {

        if (origin == 10) return puzzle;

        int vertical = 0, horizontal = -1;

        String verticalString = "", horizontalString = "";

        for (int i = 0; i < 10; i++) {

            if (puzzle[origin][i] != '+') {

                horizontalString += puzzle[origin][i];

                horizontal = i;

            } else {

                if (horizontalString.length() <= 1) {

                    horizontalString = "";

                    horizontal = -1;
                }
            }

            if (puzzle[i][origin] != '+') {

                verticalString += puzzle[i][origin];

                vertical = i;

            } else {

                if (verticalString.length() <= 1) {

                    verticalString = "";

                    vertical = -1;
                }
            }
        }

        System.out.println(horizontalString);

        ListIterator<String> iterator = words.listIterator();

        boolean flag = true;

        while (iterator.hasNext()) {

            String word = iterator.next();

            if (word.length() == horizontalString.length() && flag) {

                int start = horizontal - word.length();

                for (int i = start + 1; i <= horizontal; i++) puzzle[origin][i] = word.charAt(i - (start + 1));

                iterator.remove();
            }
            if (word.length() == verticalString.length()) {

                int start1 = vertical - word.length();

                for (int i = start1 + 1; i <= vertical; i++) puzzle[i][origin] = word.charAt(i - (start1 + 1));

                iterator.remove();

                break;
            }
        }
        return solver(origin + 1, puzzle, words);
    }


    public static void main(String[] args) {

        char[][] puzzle = {
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '-', '-', '-', '-', '-', '-', '+', '+'},
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
                {'+', '-', '-', '-', '-', '-', '-', '+', '+', '+'},
                {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
                {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'}};


        List<String> words = new ArrayList<>();
        words.add("NORWAY");
        words.add("AGRA");
        words.add("ENGLAND");
        words.add("GWALIOR");

        CrossWord cw = new CrossWord();
        puzzle = cw.solver(0, puzzle, words);
        for (char[] x : puzzle) {
            System.out.println(Arrays.toString(x));
        }
    }
}