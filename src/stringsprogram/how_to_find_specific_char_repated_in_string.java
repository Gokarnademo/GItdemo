package stringsprogram;

public class how_to_find_specific_char_repated_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = " automation java oops automation java ";
		
		int len = name.length();
		System.out.println("total length of string:"+len);
		
		String s =name.replace("n", "a");
		System.out.println(s);
		
		int str = s.length();
		
	int total = len-str;
		System.out.println(total);
		
	

	}

}
