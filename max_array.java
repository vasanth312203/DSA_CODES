
import java.lang.classfile.constantpool.Utf8Entry;
import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len;
        System.out.println("Enter the length");
        len = input.nextInt();
        int[] data = new int[len];
        System.out.println("Enter the Array element");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            data[i] = input.nextInt();
            max = Math.max(max, data[i]);
        }
        System.out.println("Maximum value is " + max);

        input.close();
    }
}
