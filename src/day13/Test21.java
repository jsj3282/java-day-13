package day13;

class Excep{
	public void exc() {
		System.out.println("������ ������ �ڵ�");
	}
}
public class Test21 {

	public static void main(String[] args) {
		
		int x = 10, y = 0, result = 0;
		Excep excep = new Excep();
		try {
			result = x / y;
			System.out.println(x + "/" + y + "=" + result);
		}catch(Exception e) {
			System.out.println("���� �� �����ϴ�.");
		}finally{
			excep.exc();
			System.out.println("�����ϰڽ��ϴ�.");
		}

	}

}
