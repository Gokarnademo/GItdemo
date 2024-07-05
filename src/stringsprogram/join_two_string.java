package stringsprogram;

public class join_two_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s ="Welcome ";
		 String s1 ="to java ";
				 String s2= "programs";
		 
		 int len =s.length();
		 System.out.println("number of string:"+len); // find lenght of string
		 
		 System.out.println(s.concat(s1).concat(s2)); // concat method is use to join two or more strings

	}

}
