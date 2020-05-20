package day13;
class Calc_04{
	public Calc_04(String n) {
		System.out.println(n + " Calc 생성자 호출");
	}
}
class Computer_04 extends Calc_04{
	public Computer_04(String s) {
		super(s);
		System.out.println(s + " Computer 생성자 호출");
	}
}
public class Test06 {

	public static void main(String[] args) {
		
		Computer_04 com = new Computer_04("안녕하세요");

	}

}
