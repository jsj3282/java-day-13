package day13;

class Parents3{
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}
class Child3 extends Parents3{
	private int num1, num2;
	public Child3(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void display() {
		System.out.println("두 수의 합 :  " + sum(num1, num2));
	}
}

public class Test12 {

	public static void main(String[] args) {
		
		Child3 ob = new Child3(100, 200);
		ob.display();
	}

}
