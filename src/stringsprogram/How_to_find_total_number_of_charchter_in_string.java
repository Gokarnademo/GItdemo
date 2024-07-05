package stringsprogram;

public class How_to_find_total_number_of_charchter_in_string {
	
	public static void main(String[]args) {
		String s = "bobade";
		
		int count=0;
		int len = s.length();
		System.out.println(len);
		for(int i=0; i<=len-1; i++) {
			if(s.charAt(i)!=' ') {
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
