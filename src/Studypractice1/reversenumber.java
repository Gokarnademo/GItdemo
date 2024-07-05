package Studypractice1;

public class reversenumber {
	
	public static void main(String[]args) {
		
//reverse=1234
 int no = 1234567;
 
 int rev = 0;
 int rem ;
 
 while(no!=0) {
	 
	 rem = no %10;
	 rev = rev*10+rem;
	 
	 no = no/10;
	 
 }
	 System.out.println(rev);
 }
		


}
