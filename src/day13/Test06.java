package day13;
class Calc_04{
	public Calc_04(String n) {
		System.out.println(n + " Calc ������ ȣ��");
	}
}
class Computer_04 extends Calc_04{
	public Computer_04(String s) {
		super(s);
		System.out.println(s + " Computer ������ ȣ��");
	}
}
public class Test06 {

	public static void main(String[] args) {
		
		Computer_04 com = new Computer_04("�ȳ��ϼ���");

	}

}
