
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = input.nextInt();
        boolean flag = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("prime number");
        } else {
            System.out.println("Not Prime Number ");
        }

        input.close();
    }
}
