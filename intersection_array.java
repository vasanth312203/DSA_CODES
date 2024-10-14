
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class intersection_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the Array sizes");
        m = input.nextInt();
        n = input.nextInt();

        int[] num1 = new int[m];
        int[] num2 = new int[n];
        for (int i = 0; i < m; i++) {
            num1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num2[i] = input.nextInt();
        }

        // using data structure

        // HashSet
        HashSet<Integer> hs = new HashSet<>();
        for (int d : num1) {
            hs.add(d);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (hs.contains(num2[i])) {
                result.add(num2[i]);

            }
        }
        System.out.println("InterSection values ");
        for (int h : result) {
            System.out.print(h + " ");
        }

    }
}