
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int l = 0;
        int r = str.length() - 1;
        boolean flag = true;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                flag = false;
            }
            l++;
            r--;
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {

            System.out.println("Not Palindrome");
        }
        input.close();
    }
}
