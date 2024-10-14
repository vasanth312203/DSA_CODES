import java.util.Arrays;
import java.util.Scanner;

public class digit_occurrence_number {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * 12348423832352330
         * 0 => 1
         * 1 => 1
         * 2 => 4 
         * 3 => 6 
         * 4 => 2 
         * 5 => 5
         * 6 => 0
         * 7 => 0
         * 8 => 2 
         * 9 => 0
         
         */
        int num = input.nextInt();
        int[] count = new int[10];
        Arrays.fill(count,0);

        // for(int i  : count){
        //     System.out.print(i+" ");
        // }

        for(int i = num ; i != 0 ; i = i / 10 ){
            int rem = i % 10 ;
            count[rem]++;
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        for(int i  : count){
            if(max < i ){
                max = i;
            }
         
        }
        System.out.print("Maximum count number is =>  "+ count[max]);



        input.close();
    }
}

