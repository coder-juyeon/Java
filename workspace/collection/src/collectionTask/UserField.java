package collectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField{
	ArrayList<User> users = DBConnecter.users;
	private final int CODELENGTH = 6;
	
//	회원가입을 누르면 비밀번호 암호화
//	이름과 아이디 비밀번호 휴대폰번호 설정 창이 뜸
	public void signUp(User user) {
		user.setPassWord(encryption(user.getPassWord()));
		users.add(user);
	}
	
//	아이디 중복검사
//	아이디를 입력하고 중복검사를 눌렀을 때
//	중복 -> temp 반환 / 중복X -> null 반환
	public User checkAccount(String id) {
		User user = null;
		for (User temp : users) {
			if(temp.getId().equals(id)) {
				user = temp;
				break;
			}
		}
		return user;
	}
	
//	로그인
//	id가 있으면은
//	매개변수의 아이디, 비밀번호와
//	users 안에 있는 아이디 비밀번호가 같으면 user 반환
//	아니면 null
	
//	매개변수랑 필드명이랑 맞춰주는것이 좋음
	public User signIn(String id, String pW) {
		if(checkAccount(id) != null) {
			for (User user : users) {
				if(user.getPassWord().equals(pW)) {
					return user;
				}
			}
		}
		return null;
	}
	
//	암호화
//	User -> password
//	private으로 선언하는것이 좋음 (여기서만 쓰는것)
	public String encryption(String pW) {
		int key = 3;
		String encryption = "";
		
		for (int i = 0; i < pW.length(); i++) {
			encryption += (char)(pW.charAt(i) * key);
		}
		return encryption;
	}
	
//	비밀번호 변경
//	현재 비밀번호를 입력하고 맞으면 변경시킨다. (화면에서 구현)
	public void changePw(User user) {
		User userInDataBase = checkAccount(user.getId());
		userInDataBase.setPassWord(encryption(user.getPassWord()));
	}

//	비밀번호 찾기 서비스
//	인증번호를 받고 인증번호가 사용자가 입력한 것과 같으면 (화면에서 구현)
//	users의 비밀번호를 리턴해준다.
	public String findPw(String code) {
		String result = null;
		for (User user : users) {
			result = user.getPassWord();
		}
		return result;
	}
	
//	인증번호 생성
	private String getNumber() {
		Random random = new Random();
		String number = "";
		for (int i = 0; i < CODELENGTH; i++) {
			number += random.nextInt(10);
		}
		return number;
	}
	
	
//	인증번호 전송
//	랜덤번호 = text 를 뽑고
//	user 폰 번호 = to
	public String getNumber(String phoneNumber) {
		Random random = new Random();
		String result = getNumber();
		
//		String api_key = "NCSGWUEC5FCHYTP3";
//	       String api_secret = "5TLKGEJT1IMAUFJGXCNVQZLBJHJVF3EE";
//	       Message coolsms = new Message(api_key, api_secret);
//
//	       // 4 params(to, from, type, text) are mandatory. must be filled
//	       HashMap<String, String> params = new HashMap<String, String>();
//	       params.put("to", phoneNumber);
//	       params.put("from", "01092142678");
//	       params.put("type", "SMS");
//	       params.put("text", result);
//	       params.put("app_version", "test app 1.2"); // application name and version
//
//	       try {
//	         JSONObject obj = (JSONObject) coolsms.send(params);
//	         System.out.println(obj.toString());
//	       } catch (CoolsmsException e) {
//	         System.out.println(e.getMessage());
//	         System.out.println(e.getCode());
//	       }
	       return result;
	}
	
}
