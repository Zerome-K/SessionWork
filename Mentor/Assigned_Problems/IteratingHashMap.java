package mentorAssignment;

import java.util.*;

public class IteratingHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Zerome" , 1023);
        map.put("Prasath" , 1024);
        map.put("Arun" , 1025);
        map.put("Moses" , 1026);
        map.put("Sibi" , 1027);

//        Method 1 : For Each loop
        for (Map.Entry<String,Integer> x: map.entrySet()) {
            System.out.println("Key : " + x.getKey() + " - Value : " + x.getValue());
        }

//        Method 2 : "Iterating overs Key Only"
//        for (String x:
//             map.keySet()) {
//            System.out.println("Key : " + x  );
//        }

//        "Method 3 : Iterating Over Values"
//        for (Integer x : map.values()) {
//            System.out.println("Values : " + x  );
//        }

//        "4. Iterating using iterators over Map.Entry<K, V>

//        Iterator<Map.Entry<String, Integer>> item = map.entrySet().iterator();
//        while(item.hasNext()){
//            Map.Entry<String, Integer> e = item.next();
//            System.out.println(e.getKey() + " - "+ e.getValue());
//        }

//        5. Using forEach(action) method :
//        map.forEach((k,v) -> System.out.println("Key : " + k + " - Value : " + v));


        Collection<Integer> c = map.values();
        List<Integer> l = new ArrayList<>(c);
        System.out.println(l);
    }
}
