import java.util.Scanner;

class SquaredPosition {
    
    public static int getSquaredOf(int a, int b){
        while(--b > 0) a = a * 2; return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int position = in.nextInt();
        System.out.println("Result : " + getSquaredOf(num, position));
    }
}