import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int fact = 1;
        if(val == 0 || val == 1){
            System.out.println("factorial "+ val + " = > " + fact);
        }
        else{
            for(int i = 2 ; i <= val ; i++){
                fact = fact * i;
            }
            System.out.println("factorial "+ val + " = > " + fact);
        }
        
        input.close();
    }
}
