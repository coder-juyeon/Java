package lambdaTest;

import java.util.Scanner;

public class PrintNameTest {
	public void printFullName(PrintName printName){
		System.out.println(printName.getFullName("±è", "ÁÖ¿¬"));
	}
	public static void main(String[] args) {
		PrintNameTest printNameTest = new PrintNameTest();
		
		printNameTest.printFullName((f, l) -> f+l);
	}
}
