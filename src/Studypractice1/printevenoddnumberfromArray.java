package Studypractice1;

public class printevenoddnumberfromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int even_count = 0;
		
		int odd_count = 0;
		int rem;
		
		for(int i=0; i<=a.length-1;i++) {
			
			rem = a[i]%10;
			
			if(rem%2==0) {
				
				even_count++;
				
				System.out.println("no is even:"+ rem);
			}
			else {
			
				odd_count++;
				System.out.println("no is odd:"+ rem);
			}
			
			a[i] = a[i]/10;
		}
		System.out.println("even no cunt:"+even_count);
		
		System.out.println("odd no cunt:"+odd_count);
		
	}
}
			
			
			
			
			
			
//			for (int x:a) {
//				
//				rem = x%10;
//				
//				if(rem%2==0) {
//					
//					even_count++;
//					
//					System.out.println("no is even:"+rem);//246
//				}
//				else {
//					
//					odd_count++;
//					
//					System.out.println("no is odd:"+rem);// 1353
//					
//				}
//				
//				x=x/10;
//				
//				
//			}
//			System.out.println("no is even:"+ even_count);//3
//			System.out.println("no is odd:"+ odd_count);//4
//		}
//		
//		
		
		

	


