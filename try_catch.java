//import java.util.*;
public class try_catch{
    public static void main(String args[]){
        int a = 9;
        int b = 0;
        
        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }
        catch(Exception z){
            System.out.println("There is gadbad in the code");

            System.out.println(z);  //? *** Dont forget to return this 
                                    //?   *** ( z )can't be changed
        }

    }
}