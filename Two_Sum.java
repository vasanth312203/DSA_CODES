
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = input.nextInt();
        }
        int[] result = new int[2];
        System.err.println("Enter the Target Value ");
        int target = input.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (data[i] + data[j] == target) {
                    result[0] = data[i];
                    result[1] = data[j];
                }
            }
        }
        // Otherwise, you can use the ArrayList instead of an Integer array

        System.out.println("Target values are ");
        for (int l : result) {
            System.out.print(l + " ");
        }
        input.close();
    }
}
