
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicates_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] data = new int[len];
        for(int i = 0 ; i < len ;i++){
            data[i] = input.nextInt(); 
        }
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0 ; i < len ; i++){
            int val = data[i];
            if(!hs.contains(val)){
                hs.add(val);
            }
            else{
                al.add(val);

            }
        }
        System.out.println("Duplicate values");

        for(int w : al){
            System.out.print(w+" ");
        }

             input.close();
    }
}



