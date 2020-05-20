package day13;

class Str01{
	protected String str;
	public Str01() {
		str = "JAVA";
	}
}
class Str02 extends Str01{
	private String str;
	public Str02() {
		str = "HELLO";
	}
	public void display() {
		System.out.println("str : " + str);
		System.out.println("super.str : " + super.str);
	}
}
public class Test11 {

	public static void main(String[] args) {
		
		Str02 ob = new Str02();
		ob.display();
	}

}
