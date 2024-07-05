package Studypractice1;

public class smallestthreeno {
	
	public static void main(String[]args) {
		int a=10, b=20,c=30;

		
		if(a<b) {
			
			if(a>c) {
				
				System.out.println("a is smallest no:"+a);
			}
			else {
				System.out.println("c is samllest no:"+c);
			}
		}
		else if(b<a && b<c) {
			
			System.out.println("b is samllest no:"+b);
		}
		
		else {
			System.out.println("c is smallest no:"+c);
		}
		
		
		
		
	}

}
