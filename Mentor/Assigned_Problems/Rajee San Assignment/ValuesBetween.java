package rajeesanassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValuesBetween {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ValuesBetween valuesBetween = new ValuesBetween();
        valuesBetween.init();
    }

    private void init() {
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        System.out.print("ENTER X : ");
        int xValue = scanner.nextInt();
        System.out.print("ENTER Y : ");
        int yValue = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();
        System.out.println(findNumbers(array, xValue, yValue));
    }

    private List<Integer> findNumbers(int[] array, int xValue, int yValue) {
        List<Integer> result = new ArrayList<>();
        for (int value : array) {
            if (value > xValue && value < yValue)
                result.add(value);
        }
        return result;
    }
}
