//Author @Manisha (Write a Java program to append text to an existing file.)
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;


public class AppendFile {
	//main method started...
	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
      
      //for catch the exception...
        try
          {
             String filename= "E:\\Mohan.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("i love programming\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("E:\\Mohan.txt"));//directory path
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
  }
