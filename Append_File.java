package File_Handling;

import java.io.PrintWriter;
import java.io.FileNotFoundException;   
  
public class Append_File {  
  
    public static void main(String[] args) throws FileNotFoundException  {  
        PrintWriter SC =new PrintWriter("C://Users//sbrah//Desktop//Simplilearn//hello.txt");  
        String S = "Hi, My name is Data "  ;
        SC.append(S);  
        System.out.println("Data Append");  
        SC.flush();  
    }  
}  