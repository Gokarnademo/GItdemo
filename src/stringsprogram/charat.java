package stringsprogram;

public class charat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "Welcome to java";
		 String rev = "";
		 
		 int len = s.length();
		 
		 for(int i= len-1; i>=0; i--) {
			 rev = rev+s.charAt(i);
			 
		 
		
		 }
		 System.out.print(rev);
		 
	}

}
