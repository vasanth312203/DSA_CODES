
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        check ck = new check();
        System.out.println(" Enter the String-1 ");
        String str1 = input.nextLine();
        System.out.println(" Enter the String-2 ");
        String str2 = input.nextLine();

        boolean result = ck.validate(str1, str2);
        System.out.println(result == true ? " Anagram " : " NOt Anagram ");

        input.close();
    }

}

class check {
    public boolean validate(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}