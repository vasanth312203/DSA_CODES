
import java.util.Scanner;

public class Remove_Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // using the regular expression
        // remove vowel show remaining

        str = str.replaceAll("[aeiouAEIOU]", "");

        // remove non vowels show remaing
        // str = str.replaceAll("[^aeiouAEIOU]", "");

        System.err.println(" Remove Vowels from a String => " + str);

        input.close();
    }

}
