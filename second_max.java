
import java.util.Scanner;

public class second_max {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] data = new int[len];
        for (int i = 0; i < len; i++) {
            data[i] = input.nextInt();
        }
        // using the bubble sort
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (data[j + 1] < data[j]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

        }

        System.err.println("second max " + data[1]);

        /*
         * for(int i = 0; i < len ; i++) {
         * System.out.print(data[i]+" ");
         * }
         */

        input.close();
    }

}
