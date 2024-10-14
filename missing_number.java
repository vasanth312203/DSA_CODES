import java.util.*;

public class missing_number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = input.nextInt();
        }
        // using DSA -> SET
        HashSet<Integer> hs = new HashSet<>();

        for (int k : data) {
            hs.add(k);
        }

        for (int i = 1; i <= len + 1; i++) {
            if (!hs.contains(i)) {
                System.out.println("Missing value  " + i);
                break;
            }
        }
        input.close();
    }

}
