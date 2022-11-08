package tiresome;

import java.util.*;

public class FrequencySorting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Getting Input
        System.out.print("ENTER ARRAY SIZE : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();

        //Passing Array for Sort
        FrequencySorting fs = new FrequencySorting();
        fs.sortByFrequency(array);
        System.out.println(Arrays.toString(array));
    }

    private void sortByFrequency(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : array)map.put(num,map.getOrDefault(num,0)+1);
        TreeMap<Integer, TreeSet<Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<Integer,Integer> freq : map.entrySet()) {
            TreeSet<Integer> set = treeMap.getOrDefault(freq.getValue(),new TreeSet<>());
            set.add(freq.getKey());
            treeMap.put(freq.getValue(),set);
        }
        int idx = 0;
        for (Map.Entry<Integer,TreeSet<Integer>> res: treeMap.entrySet()) {
            for (Integer num : res.getValue()) {
                for (int i = 0; i < res.getKey(); i++) array[idx++] = num;
            }
        }
    }
}
