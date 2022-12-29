//Author @Manisha(java program to count the tottle no.of characters in string)
   

   public class Demo {
	public static void main(String[] args) {    
        String string = "Hello I Am Manisha";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     

