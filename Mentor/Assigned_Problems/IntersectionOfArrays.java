package mentorAssignment;


import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {

    public static void main(String[] args) {

        int[]  a = {5, 6, 4, 3, 2, 9};

        int[]  b = {8, 2, 6, 6, 2, 9};

        Object[] res = intersectionArray(a, b);

        System.out.println("INTERSECTED ARRAY : " + Arrays.toString(res));

    }

    private static Object[] intersectionArray(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        ArrayList<Object> res = new ArrayList<>();

        while(i < a.length && j < b.length){

            if(a[i] == b[j]) {

                res.add((Integer) a[i]);
                i++;
                j++;

            } else if (a[i] > b[j]) j++;

            else i++;
        }
        return res.toArray();
    }
}
