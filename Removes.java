//Author @Manisha(w.a.p to remove all the white spaces from a string)
public class Removes {
	public static void main(String[] args) {
        String sentence = "All is well";
        System.out.println("Original sentence: " + sentence);

      //Removes the white spaces    
        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}

