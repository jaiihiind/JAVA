package LAB_PROGRAMS;
import java.util.*;

public class sort_array_2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        // int n = arr.length;
        
        System.out.println("Please enter the size of array : ");
        int a = s.nextInt();
        int arr[] = new int[a];

        System.out.println("Please enter array : ");
        for(int i =0; i<a; i++){
            //System.out.println(i);
            arr[i]=s.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Arrays : ");
        for(int i=0; i<a; i++){
            System.out.println(arr[i]);
        }

    }
    
}
