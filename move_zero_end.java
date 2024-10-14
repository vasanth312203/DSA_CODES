
import java.util.Scanner;

public class move_zero_end {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len;
        len = input.nextInt();
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = input.nextInt();
        }
        int[] val = new int[len];
        int i = 0;
        int pos = 0;
        while (i < len) {
            if (data[i] != 0) {
                val[pos++] = data[i];
            }

            i++;
        }

        for (int k : val) {
            System.out.print(k + " ");
        }
        input.close();
    }
}
