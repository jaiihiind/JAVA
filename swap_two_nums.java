package LAB_PROGRAMS;
import java .util.*;
public class swap_two_nums {

    public static void main(String [] args){


        Scanner p = new Scanner (System.in);
        System.out.print("enter 1st number : ");
        int a = p.nextInt();
        
        System.out.print("enter 2nd number : ");
        int b = p.nextInt();

        System.out.println("Before swapping -> " + a + " " + b);

    // Using 3rd variable
        int temp =a ;
        a = b;
        b = temp ; 


    // Without using 3rd variable
        // Using + & - operator
        a = a + b; 
        b = a - b;
        a = a - b;

        // Using * & / operator 
        a = a * b;
        b = a / b;
        a = a / b;

        // Using XOR operator      ( same = 0 ,  diff = 1)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // Using one line
        b = a + b - (a = b);


        System.out.println("After swapping -> " + a + " " + b);
    }
    
}
