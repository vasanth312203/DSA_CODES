
import java.util.Arrays;
import java.util.Scanner;

public class Longest_Common_Prefix{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        String[]  str = new String[len];
        for(int i = 0 ; i < len ; i++){
        str[i] = input.next();
        }
      
        // System.out.println("\ndisplay the String");
        // for(String k : str){
        //     System.out.print(k+" ");
        // }
          Arrays.sort(str);

        //   System.out.println("\ndisplay the After Sorting  String");
        //   for(String k : str){
        //       System.out.print(k+" ");
        //   }

        String first = str[0];
        String  last = str[len-1];
        int index = 0;
        while(index < str[0].length()){
            if(first.charAt(index) == last.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }

        System.out.println("  Longest Common Prefix is => "+  first.substring(0,index));



        input.close();
    }
}

