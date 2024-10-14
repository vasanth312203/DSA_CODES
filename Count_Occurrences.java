
import java.util.Scanner;

public class Count_Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        System.out.println("Enter the character to count");
        char  c = input.nextLine().charAt(0);
        int count = 0;
        for(int i = 0 ; i < str.length() ;i++){
            if(c == str.charAt(i)){
                count++;
            }
        }
         System.err.println(c + " => " + count);
        input.close();
    }
}
