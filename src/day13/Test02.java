package day13;
class Calc_01{
	public void display() {
		System.out.println("���� �����");
	}
}
class Computer_01 extends Calc_01{
	public void print() {
		display();
		System.out.println("���� ��ǻ�;�");
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		Computer_01 com = new Computer_01();
		com.print();

	}

}
