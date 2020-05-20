package day13;

class Calc_02{
	public Calc_02() {
		System.out.println("Calc 생성자 호출");
	}
}
class Computer_02 extends Calc_02{
	public Computer_02() {
		System.out.println("Computer 생성자 호출");
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		Computer_02 com = new Computer_02();

	}

}
