package classTest;

class SuperCar{
//	�귣��, ���� ����
	String brand;
	String color;
	String password;
	int price;
	int wrongCount;
	
	{
		password = "0000";
	}
//	���� ����
	boolean check;
	
//	������
	public SuperCar() {
		
	}
	
	SuperCar(String brand, String color, int price, String password){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	�õ� �ѱ�
//	���� ���¸� Ȯ���ϰ�
//	�õ��� �����ִٸ�, "�õ� �ѱ�" ���
//	�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
	boolean startEngine(){
		if(!check) {
	         check = true;
	         return true;
	      }
	      return false;
	}

//	�õ� ����
//	���� ���¸� Ȯ���ϰ�
//	�õ��� �����ִٸ� "�õ� ����" ���
//	�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
	
	boolean endEngine() {
		if(check) {
			check = false;
			return true;
		}
		return false;
	}
//	�õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
//	3�� ���� �߸� �Է����� �� "���� �⵿" ���
//	���ڿ� �񱳴�  ==�� �ƴ� .equals()�� ���ֱ�
	
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
}


public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar ���ֿ� = new SuperCar("ben", "black", 6000, "1234");
		���ֿ�.endEngine();
		���ֿ�.startEngine();
		���ֿ�.endEngine();
		���ֿ�.endEngine();
		���ֿ�.startEngine();
		���ֿ�.startEngine();
		
		
	}
}

