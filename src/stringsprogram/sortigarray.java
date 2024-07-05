package stringsprogram;

import java.util.Arrays;

public class sortigarray {

	public static void main(String[] args) {
        String[] s = {"Orange", "apple", "Banana", "Grapes", "Pineapple"};

       // Display the original array
       
        Arrays.sort(s);
         for (String element : s) {
           System.out.print(element + " ");
       }
       
   }
}
