 package stringsprogram;


public class ReverseWordsSameLocation {
    public static void main(String[] args) {
        String s = "gokarna bobade";
        String reversedString = reverseWordsSameLocation(s);
        System.out.println(reversedString);
    }

    public static String reverseWordsSameLocation(String input) {
        // Split the input string into individual words
        String[] words = input.split(" ");

        // Reverse each word and build the reversed string
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (String word : words) {
            reversedStringBuilder.append(reverseString(word)).append(" ");
        }

        // Remove the trailing space and return the result
        return reversedStringBuilder.toString().trim();
    }

    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the character array
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the start and end pointers towards each other
            start++;
            end--;
        }

        // Convert the reversed character array back to a string
        return new String(charArray);
    }
}
