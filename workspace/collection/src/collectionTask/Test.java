package collectionTask;

public class Test {
	public static void main(String[] args) {
		UserField userField = new UserField();
		User juyeon = new User();
		MessageTest messageTest = new MessageTest();
		
		juyeon.setId("ju12");
		juyeon.setName("김주연");
		juyeon.setPassWord("1234");
		juyeon.setPhoneNumber("01012345678");
//		회원가입 테스트
		userField.signUp(juyeon);
		System.out.println(juyeon);
		
		
//		아이디 중복 테스트
		System.out.println(userField.checkAccount("ju12"));
		
//		로그인 테스트
		System.out.println(userField.signIn("ju12", "1234"));
		
//		암호화 테스트
		String result2 = userField.encryption("1234");
		System.out.println(result2);
		
//		인증번호 테스트
		String result3 =  userField.getNumber("01022876873");
		System.out.println(result3);
		
//		비밀번호 변경 테스트
//		String result4 = userField.changePw("0000");
//		System.out.println("변경된 비밀번호: " + result4);
		
//		비밀번호 찾기 테스트
//		result5 = result3 즉 인증번호를 받아야 하지만
//		테스트용으로 하나를 선언해주었다.
		String result5 = "365413";
		String code = "365413";
		if(result5.equals(code)) {
			System.out.println(userField.findPw(code));
		}
		else {
			System.out.println("코드가 다릅니다.");
		}
	}
}
