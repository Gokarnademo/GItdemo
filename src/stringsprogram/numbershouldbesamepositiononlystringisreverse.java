package stringsprogram;

public class numbershouldbesamepositiononlystringisreverse {

	
	    public static void main(String[] args) {
	        String s = "gokarna123";
	        String result = reverseSubstring(s);
	        System.out.println(result);
	    }

	    private static String reverseSubstring(String s) {
	        char[] charArray = s.toCharArray();
	        int length = charArray.length;

	        // Find the position of the first digit in the string
	        int digitIndex = 0;
	        for (int i = 0; i < length; i++) {
	            if (Character.isDigit(charArray[i])) {
	                digitIndex = i;
	                break;
	            }
	        }

	        // Reverse the substring before the first digit
	        reverseArray(charArray, 0, digitIndex - 1);

	        return new String(charArray);
	    }

	    private static void reverseArray(char[] array, int start, int end) {
	        while (start < end) {
	            char temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}
