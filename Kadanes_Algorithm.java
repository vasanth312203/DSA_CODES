
import java.util.Scanner;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();
        int[] data = new int[len];
        for(int i = 0 ; i < len ; i++){
            data[i] = input.nextInt();
        }

        int current = data[0];
        int maximum = data[0];


        // Method => Kadane's Algorithm 
        
        for(int i = 1 ; i < len ; i++){
            current = Math.max(data[i] , current+data[i]);

            maximum = Math.max(maximum , current);
        }


        System.err.println("Maximum subarray sum is " + maximum);
        input.close();
    }
}


/*
 * 
 * 4 
4 -1 2 1    
Maximum subarray sum is 6

i = 0
========
c = 4
m = 4
========

++++++++++++++++++++++++++++++++++++

i = 1
========
c = 3
m = 4
========

++++++++++++++++++++++++++++++++++++
i = 2
========
c = 5
m = 5
========

++++++++++++++++++++++++++++++++++++
i = 3
========
c = 6
m = 6
========
 
    Print ( " maximum subarray sum is " + m );


 */