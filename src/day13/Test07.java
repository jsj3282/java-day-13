package day13;

class Super{
	public int num;
	public int num1;
	public Super() {
		num = 100;
		num1 = 500;
	}
}
class child extends Super{
	private int su;
	private int su1;
	public child() {
		su = 10;
		su1 = 20;
	}
	public void display() {
		System.out.println("num : " + num + " num1 : " + super.num1);
		System.out.println("su : " + su + " su1 : " + su1);
	}
}
public class Test07 {

	public static void main(String[] args) {
		
		child ch = new child();
		ch.display();

	}

}
