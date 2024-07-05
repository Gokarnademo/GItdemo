package stringsprogram;

import java.nio.file.spi.FileSystemProvider;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "gokarna";
		String name2 = name;
	
	
	String rev=  "";
	
		
		for (int i= name.length()-1; i>=0;i--)
		{		
			
			rev = rev+name.charAt(i);
			
		
		}
		if(name2.equals(rev)) {
			
			System.out.println("is palindrome:"+ name2);
		}


		else
		{
			System.out.println("is not palindrome:"+name2);
		}

	}



}
