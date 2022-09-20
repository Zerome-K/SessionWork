package mentorAssignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArray {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(30);

        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
