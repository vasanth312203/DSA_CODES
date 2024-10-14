
import java.util.HashMap;
import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = input.nextInt();
        }
        // using DSA HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < len; i++) {
            hm.put(data[i], hm.getOrDefault(data[i], 0) + 1);
        }

        int maximum = Integer.MIN_VALUE;
        int val = 0;

        for (int l : hm.keySet()) {
            if (maximum < hm.get(l)) {
                maximum = hm.get(l);
                val = l;
            }
        }

        System.out.println("max_value = " + val + " and count =  " + maximum);

        input.close();
    }
}
