package stringsprogram;

public class remove_the_spaces_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="java@automation@program+";
		int len= s.length();
		System.out.println(len);
		
		String str =s.replaceAll("\\@", " ");

		System.out.println(str);
		int len2 = str.length();
		
		System.out.println(len2);
	}

}
