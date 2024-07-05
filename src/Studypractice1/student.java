package Studypractice1;

public class student {
	
	int sid; String sname; char grade;
	
	void show() {
		
		System.out.println(sid + " "+sname+ " "+grade);
	}
	
	student(int id, String name, char g){
		
		sid = id;
		sname = name;
		grade = g;
	}
	

}
