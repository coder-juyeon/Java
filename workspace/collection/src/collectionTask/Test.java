package collectionTask;

public class Test {
	public static void main(String[] args) {
		UserField userField = new UserField();
		User juyeon = new User();
		MessageTest messageTest = new MessageTest();
		
		juyeon.setId("ju12");
		juyeon.setName("���ֿ�");
		juyeon.setPassWord("1234");
		juyeon.setPhoneNumber("01012345678");
//		ȸ������ �׽�Ʈ
		userField.signUp(juyeon);
		System.out.println(juyeon);
		
		
//		���̵� �ߺ� �׽�Ʈ
		System.out.println(userField.checkAccount("ju12"));
		
//		�α��� �׽�Ʈ
		System.out.println(userField.signIn("ju12", "1234"));
		
//		��ȣȭ �׽�Ʈ
		String result2 = userField.encryption("1234");
		System.out.println(result2);
		
//		������ȣ �׽�Ʈ
		String result3 =  userField.getNumber("01022876873");
		System.out.println(result3);
		
//		��й�ȣ ���� �׽�Ʈ
//		String result4 = userField.changePw("0000");
//		System.out.println("����� ��й�ȣ: " + result4);
		
//		��й�ȣ ã�� �׽�Ʈ
//		result5 = result3 �� ������ȣ�� �޾ƾ� ������
//		�׽�Ʈ������ �ϳ��� �������־���.
		String result5 = "365413";
		String code = "365413";
		if(result5.equals(code)) {
			System.out.println(userField.findPw(code));
		}
		else {
			System.out.println("�ڵ尡 �ٸ��ϴ�.");
		}
	}
}
