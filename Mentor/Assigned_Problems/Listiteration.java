package mentorAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listiteration {


    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> iter = list.listIterator();
        System.out.println("Iterating using List Iterator : ");
        while(iter.hasNext()) System.out.print(iter.next() + " ");

        System.out.println("\nIterating Backward using List Iterator : ");
        while(iter.hasPrevious()) System.out.print(iter.previous()+ " ");

        System.out.println("\nIterating  using Foreach Loop : ");
        for(Integer x : list) System.out.print(x + " ");

        System.out.println("\nIterating  using For Loop : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println("\nIterating  using While Loop : ");
        int i = -1;
        while(i++ < list.size()-1) {
            System.out.print(list.get(i)+" ");
        }

    }

}
