import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FourteHacker {


    static Stack<Character> stack = new Stack<>();
    public static void add(int[] a, int res){

        int total = 0;

        for (int x:
             a) {
            total += x;
        }
        if(total == res) {

            for (int x : a) {
                FourteHacker.stack.push((char) (48 + x));
                FourteHacker.stack.push('+');
            }
        }
    }

    static void addExceptOne(int[] arr, int resultant) {

        int total = 0;

        boolean flag = false;

        for (int x : arr) total += x;

        for (int i = 0; i < arr.length; i++) {

            if((total - arr[i]*2)== resultant){

                for (int j = 0; j < arr.length; j++) {

                    if(j != i) {

                        FourteHacker.stack.push((char) (48 + arr[j]));
                        FourteHacker.stack.push('+');
                        flag = !flag;

                    }
                }
            }
            if(flag){
                FourteHacker.stack.pop();
                FourteHacker.stack.push('-');
                FourteHacker.stack.push((char) (48 + arr[i]));
                break;
            }
        }

    }

    public static String release() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) sb.append(stack.get(i));
        return sb.toString();
    }

    public static void main(String[] args) {

        FourteHacker fk = new FourteHacker();

        Scanner in = new Scanner(System.in);

        System.out.print("ENTER RESULTANT NUMBER : ");
        int resultant = in.nextInt();

        int[] arr  = new int[4];

        System.out.print("\nENTER EXPRESSION NUMBERS ");
        for (int i = 0; i < 4; i++) {
            System.out.print("\n-> ");
            arr[i] = in.nextInt();
        }

        add(arr,resultant);

        addExceptOne(arr, resultant);

        excepTwo(arr, resultant);


        if(!stack.empty()){
            System.out.println(release());
        }else System.out.println("BYe Bye");

    }

    private static void excepTwo(int[] arr, int resultant) {

        int total = 0;

        boolean flag = false;

        for (int x : arr) total += x;

        int i = 0, temp = 0;

        for ( i = 0; i < arr.length; i++) {

            if((total - arr[i+1])== resultant){

                for (int j = 0; j < arr.length; j++) {

                    if(j != i) {

                        FourteHacker.stack.push((char) (48 + arr[j]));
                        FourteHacker.stack.push('+');
                        flag = !flag;

                    }
                }
            }
            if(flag){
                FourteHacker.stack.pop();
                FourteHacker.stack.push('-');
                FourteHacker.stack.push((char) (48 + arr[i]));
                break;
            }
        }
    }
}
