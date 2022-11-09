package tiresome;

import java.util.Scanner;

public class StringReverse {
    public void reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NO.OF TESTCASES : ");
        int testcases = scanner.nextInt();
        while(testcases-- > 0){
            System.out.print("ENTER STRING : ");
            String str = scanner.next();
            StringBuilder reverseStr = new StringBuilder(str);
            reverseStr.reverse();
            int idx = 0;
            for (int i = 0; i < str.length(); i++) {
                if (reverseStr.charAt(idx) == str.charAt(i)) idx++;
            }
            System.out.println(str.length()-idx);
        }
    }
    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.reverse();
    }
}
