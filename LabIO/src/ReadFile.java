//Author @Manisha(Write a java program to read a file line by line and store it into a variable..)


import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	//main method start...
	public static void main(String args[]){
		
		
		//for catch the exception...
		try {
			FileReader r=new FileReader("E:\\Mohan.txt");//directory path
			
			
			try
			{
				int i;
				while((i=r.read())!=-1)//read the file content
				{
					System.out.print((char)i);
				}
			}
			finally {
				r.close();
			}}
			catch(IOException e)
			{
				System.out.println("Exception handeled.....");
			
		}
        
}
	
}


