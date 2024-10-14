import java.util.Scanner;

public class GCD {
    

      // Euclidean Algorithm
      
    public static int  helper(int n , int m){

        while(m != 0){
            int rem = n % m ;
            n = m;
            m = rem;

        }
      return n ;
    }


 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
System.out.println("The GCD Value is " + helper(num1,num2));
        

        input.close();
    }
}



