package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTest {
   public static void main(String[] args) {
      User user = new User(1, "hds1234", "1234", "�ѵ���", 20);
//      ��ü�� JSON�������� ����
      JSONObject userJSON = new JSONObject(user);
      JSONParser parser = new JSONParser();
      System.out.println(userJSON);
      
      try {
//         JSON ������ ���ڿ��� HashMap���� ����
         HashMap<String, Object> result = (HashMap)(parser.parse(userJSON.toString()));
         System.out.println(result);
         System.out.println(result.get("number"));
         System.out.println(result.get("id"));
      } catch (ParseException e) {
         e.printStackTrace();
      }
      
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
		
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
      Product goods = new Product(1, 1000, 10, "����");
      JSONObject goodsJSON = new JSONObject(goods);
      System.out.println(goodsJSON);
      
//      2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
      try {
		System.out.println(goodsJSON.get("stock"));
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
//		3. ���� ���� ��ǰ ���� ����
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//		5. JSON�������� ����
//		6. JSON�� ������ �ʵ� �߰�
//		7. JSON������ ��ǰ ���� �� ���η� ���
      
      Product discountGoods = new Product(2, 1000, 10, "����");
      JSONObject discountJSON = new JSONObject(discountGoods);
      
      double discouontRate = 0.5;
      
      try {
    	  discountJSON.put("discount", discouontRate);
	} catch (JSONException e) {
		e.printStackTrace();
	}
      System.out.println(discountJSON);
   }
}







