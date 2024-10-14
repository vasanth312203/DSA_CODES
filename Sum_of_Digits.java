import java.util.Scanner;

public class Sum_of_Digits {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long data = input.nextLong();
        long org = data ;
        long sum = 0;
        while(data != 0 ){
            long rem = data % 10;
            sum  = sum + rem ;
            data = data / 10 ;
        }
        System.err.println(" Sum of the digit "+ org + "  =>  "+ sum);
        input.close();
    }
}
