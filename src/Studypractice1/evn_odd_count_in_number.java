package Studypractice1;

public class evn_odd_count_in_number {

	
	public static void main(String[]args) {
		
		int num= 1234532746;
		int even_count= 0;
		int odd_count= 0;
		int rem;
		
		while(num>0) {
			rem = num%10;
			
			if(rem%2==0) {
				
				even_count++;
				System.out.println("no of even no:"+rem);
			}
			else {
				
				odd_count++;
				
				System.out.println("no of odd no:"+rem);
			}
			num= num/10;
			
			
			
			
		
			
		}
		System.out.println(even_count);
		System.out.println(odd_count);
	}
}
