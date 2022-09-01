/*  Author @Manisha Singh(Write a program to count number of char in a string entered by user excluding space.)*/

import java.util.Scanner;
public class Space {

	public static void main(String[] args) 
	  {    
	        //Take input from the user
	        Scanner sc=new Scanner(System.in);    
	        int count = 0,i=0;    
	        System.out.print("Please Enter a String to Count Characters =  ");
			String str = sc.nextLine();
			//Use a while loop to calculate the total characters in the string
			while(i < str.length())
			{
				if(str.charAt(i) != ' ') 
				{
					count++;
				}
				i++;
			}		
			System.out.println("The Total Number of Characters without space  =  " + count);        
	    }      

}