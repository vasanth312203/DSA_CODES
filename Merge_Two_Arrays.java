import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Arrays {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len1 = input.nextInt();
        int len2 = input.nextInt();
        int[] num1 = new int[len1];
        int[] num2 = new int[len2];

        System.out.println("Enter Array 1 Elements ");
        for(int i =0  ; i < len1 ; i++){
            num1[i] = input.nextInt();
        }
        System.out.println("Enter Array 2 Elements ");
        for(int i =0  ; i < len2 ; i++){
            num2[i] = input.nextInt();
        }

        int[] result = new int[len1+len2];

        int index = 0;
        for(int k : num1){
            result[index++] = k;
        }
        for(int d : num2){
            result[index++] = d;
        }
        Arrays.sort(result);

        System.out.println("Merged of Two Array ");
        for(int e : result){
            System.out.print(e + " ");
        }
        
        input.close();
    }


    
}
