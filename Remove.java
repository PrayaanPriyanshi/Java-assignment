//Author @Manisha(w.a.p to remove duplicate element in an array)

import java.util.Arrays;
public class Remove {
	public static int[] removeDuplicateElements(int arr[]){
	      int n = arr.length;
	      int[] temp = new int[n];
	      int j = 0;
	      for (int i=0; i<n-1; i++){
	         if (arr[i] != arr[i+1]){
	            temp[j++] = arr[i];
	         }
	      }
	      temp[j++] = arr[n-1];    
	     
	      return temp;
	       
	    }
	     
	    public static void main (String[] args) {
	       int arr[] = {10,20,30,40,10,20,10,20,30,40};
	       
	       //sort the array
	       Arrays.sort(arr);
	       int[] result = removeDuplicateElements(arr);
	       
	       //printing array elements
	       for (int i=0; i<result.length; i++)  {
	          if(result[i] != 0){
	             System.out.print(result[i]+" ");
	          }        
	       }
	   }
}
