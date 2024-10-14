
import java.util.HashSet;
import java.util.Scanner;

public class remove_duplicate {
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
        for (int l : hs) {
            System.out.print(l + " ");
        }
        input.close();
    }
}
