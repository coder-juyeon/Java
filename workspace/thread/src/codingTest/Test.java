package codingTest;

public class Test {
	public static void main(String[] args) {
		String data = "132345";
		int[] s = new int[data.length()];
		
		
		for (int i = 0; i < data.length(); i++) {
			s[i] = data.charAt(i) - '0';
			System.out.println(s[i]);
		}
	}
}
