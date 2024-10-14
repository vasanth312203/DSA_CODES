
import java.util.HashMap;
import java.util.Scanner;

public class First_Unique_Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // Using DSA

        // HaashMap
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            // First Unique Character in a String
            char c = str.charAt(i);
            if (hm.get(c) == 1) {
                System.out.println("unique value is " + c);
                break;
            }
        }
        input.close();
    }

}
