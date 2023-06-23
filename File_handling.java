import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.*;
public class File_handling {
    public static void main(String args[]){

//todo          *** CREATING A FILE ***


try{
            File dabba = new File("naya_file.txt");
            dabba.createNewFile();
        }
        catch(IOException z){
            z.printStackTrace();
        }



//todo         *** WRITING TO A FILE ***

        try{
            FileWriter likho = new FileWriter("naya_file.txt");
            likho.write("Shauryam Dhaksham Yudhay ,Balidan Paramo Dharma");

            likho.close();  //! Dont forget to close it 
        }
        catch(IOException z){
            z.printStackTrace();
        }


//todo        *** DELETING A FILE ***
    //     File naya_file = new File("naya_file.txt");
    //     if(naya_file.delete()){
    //         System.out.println("I have deleted: " + naya_file.getName());
    //     }
    //     else{
    //         System.out.println("Some problem occurred while deleting the file");
    //     }
     }
    
}
