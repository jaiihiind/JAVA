import java.util.*;
public class List_and_arrays_methods {              //! Don't change name again.(Change both side)
    public static void main(String[] args){

        //todo->           *** ArrayList ( VARIABLE SIZE ) ***

        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2);            // Printing a list
        list.add(3);

        //System.out.println(list);             //? Prints with '[ ]' *

        Collections.sort(list);   //*should be defined before the loop |.sort(*name_inside*)|

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));   //? Printing without '[ ]' *
        }

//*************************************************************************************************************************** */

        //?               Arrays  ***(defined length)***

        //int arr[] = {3,4,9};
        //int n = arr.length;  // size of the array >> autom. defining
        //System.out.println("Array before sorting : "+ Arrays.toString(arr));    // Prints the array without loop ***when arr. alredy defined***


        int arr[] = new int[5];   //{1,2,3,4}  can be defined by user
        Scanner s = new Scanner(System.in);
        
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Enter elements at " + i +":");
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);   //*** STL for sorting arrays ****

        for(int i = 0 ; i<5 ; i++){
            System.out.println(arr[i]);
        }





    }
    
}
