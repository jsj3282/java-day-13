package day13;

public class Test20 {

	public static void main(String[] args) {
		
		int x = 10, y = 0, result = 0;
		try {
			result = x / y;
			System.out.println(x + "/" + y + "=" + result);
		}catch(Exception e) {
			System.out.println("���� �� �����ϴ�.");
		}finally {
			System.out.println("�����ϰڽ��ϴ�.");
		}

	}

}
