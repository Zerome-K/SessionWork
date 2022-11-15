package rajeesanassignment;

import java.util.Scanner;

public class EncryptString {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EncryptString encryptString = new EncryptString();
        encryptString.init();
    }

    private void init() {
        System.out.println("ENTER STRING 1 : ");
        String string1 = scanner.next();
        System.out.println("ENTER STRING 2 : ");
        String string2 = scanner.next();
        System.out.println(encryptString(string1, string2));
    }

    private String encryptString(String string1, String string2) {
        String result = "";
        for (int i = 0; i < string1.length(); i++) {
            int asciiValue = string1.charAt(i) + string2.charAt(i) - 'a' + 1;
            if (asciiValue > (int) 'z')
                asciiValue = asciiValue - 26;
            result += (char) (asciiValue);
        }
        return result;
    }
}