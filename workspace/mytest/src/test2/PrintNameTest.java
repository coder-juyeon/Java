package test2;

public class PrintNameTest {
	public void printFullName(PrintName printName) {
		System.out.println(printName.getFullName("��", "�ֿ�"));
	}
	
	public static void main(String[] args) {
		PrintNameTest printNameTest = new PrintNameTest();
		PrintName printName = (l,f) -> l+f;
		
		printNameTest.printFullName(printName);
	}
}
