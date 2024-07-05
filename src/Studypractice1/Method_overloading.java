package Studypractice1;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_overloading a = new Method_overloading();
		a.add(20, 30);
		a.add(10, 10, 10);

	}

	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Adition of no:" + c);

	}

	public void add(int x, int y, int z) {

		int sum = x + y + z;

		System.out.println(sum);

	}

}
