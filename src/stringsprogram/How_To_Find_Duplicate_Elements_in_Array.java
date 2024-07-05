package stringsprogram;

public class How_To_Find_Duplicate_Elements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr = {"java", "c", "phython", "java","c"};

boolean flag = false;

for(int i= 0; i<arr.length;i++) {
	
	for(int j=i+1; j<arr.length;j++) {
		
		if(arr[i]==arr[j]) {
		System.out.println(arr[i]);
		flag=true;
		break;
	}
	}	
}
if(flag=false) {
	
	System.out.println("duplicate elements not found");
}

		
		
		
		
		
		
		
		
		
	}

}
