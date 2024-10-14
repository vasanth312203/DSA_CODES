
import java.util.Scanner;

public class combain_array {
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
        for (int i = 0; i < m; i++) {
            num2[i] = input.nextInt();
        }

        // using another array

        int[] inter = new int[m + n];
        int l = 0;
        for (int k : num1) {
            inter[l++] = k;
        }
        for (int j : num2) {
            inter[l++] = j;
        }

        System.out.println(" Combain Array");
        for (int d : inter) {
            System.out.print(d + " ");
        }

        input.close();
    }

}
