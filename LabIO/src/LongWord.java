//Author @Manisha(Write a Java program to find the longest word in a text file.)

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class LongWord {
	//main method started...
	public static void main(String [ ] args) throws FileNotFoundException {
        new LongWord().findLongestWords();
   }

public String findLongestWords() throws FileNotFoundException // throw the exception directly to the jvm
{

 String longest_word = "";
 String current;
 Scanner sc = new Scanner(new File("E:\\Mohan.txt"));//directory path

//to check the longest word...
 while (sc.hasNext()) {
    current = sc.next();
     if (current.length() > longest_word.length()) {
       longest_word = current;
     }

 }
   System.out.println("\n"+longest_word+"\n");
      return longest_word;
}}