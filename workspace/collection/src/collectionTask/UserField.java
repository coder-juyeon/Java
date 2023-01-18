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
	
//	ȸ�������� ������ ��й�ȣ ��ȣȭ
//	�̸��� ���̵� ��й�ȣ �޴�����ȣ ���� â�� ��
	public void signUp(User user) {
		user.setPassWord(encryption(user.getPassWord()));
		users.add(user);
	}
	
//	���̵� �ߺ��˻�
//	���̵� �Է��ϰ� �ߺ��˻縦 ������ ��
//	�ߺ� -> temp ��ȯ / �ߺ�X -> null ��ȯ
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
	
//	�α���
//	id�� ��������
//	�Ű������� ���̵�, ��й�ȣ��
//	users �ȿ� �ִ� ���̵� ��й�ȣ�� ������ user ��ȯ
//	�ƴϸ� null
	
//	�Ű������� �ʵ���̶� �����ִ°��� ����
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
	
//	��ȣȭ
//	User -> password
//	private���� �����ϴ°��� ���� (���⼭�� ���°�)
	public String encryption(String pW) {
		int key = 3;
		String encryption = "";
		
		for (int i = 0; i < pW.length(); i++) {
			encryption += (char)(pW.charAt(i) * key);
		}
		return encryption;
	}
	
//	��й�ȣ ����
//	���� ��й�ȣ�� �Է��ϰ� ������ �����Ų��. (ȭ�鿡�� ����)
	public void changePw(User user) {
		User userInDataBase = checkAccount(user.getId());
		userInDataBase.setPassWord(encryption(user.getPassWord()));
	}

//	��й�ȣ ã�� ����
//	������ȣ�� �ް� ������ȣ�� ����ڰ� �Է��� �Ͱ� ������ (ȭ�鿡�� ����)
//	users�� ��й�ȣ�� �������ش�.
	public String findPw(String code) {
		String result = null;
		for (User user : users) {
			result = user.getPassWord();
		}
		return result;
	}
	
//	������ȣ ����
	private String getNumber() {
		Random random = new Random();
		String number = "";
		for (int i = 0; i < CODELENGTH; i++) {
			number += random.nextInt(10);
		}
		return number;
	}
	
	
//	������ȣ ����
//	������ȣ = text �� �̰�
//	user �� ��ȣ = to
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
