import java.util.Scanner;

public class Power_of_Two {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // if( num > 0 && ( num & (num-1) ) == 0){
        //     System.out.println("Its Power of 2 ");
        // }
        // else{
        //     System.out.println("Its NOT power of 2 ");

        // }

        // using ternary operator
        
        System.out.println(( num > 0 && ( num & (num-1) ) == 0) ? "Its Power of 2" : " Its NOT power of 2 ");
        
        input.close();
    }


}
