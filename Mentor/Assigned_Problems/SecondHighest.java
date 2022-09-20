package mentorAssignment;

public class SecondHighest {

    public static void main(String[] args) {

        int[] array = {54, 62, 58, 96, 21, 36, 78};

        System.out.println("Second Highest Element in Array: " + secondHighest(array));
    }
    private static int secondHighest(int[] array) {

        int highest = array[0], secondHighest = array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i] > highest) {

                secondHighest = highest;

                highest = array[i];

            } else if (array[i] > secondHighest) secondHighest = array[i];

        }

        return secondHighest;

    }

}
