package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTest {
   public static void main(String[] args) {
      User user = new User(1, "hds1234", "1234", "한동석", 20);
//      객체를 JSON형식으로 변경
      JSONObject userJSON = new JSONObject(user);
      JSONParser parser = new JSONParser();
      System.out.println(userJSON);
      
      try {
//         JSON 형식의 문자열을 HashMap으로 변경
         HashMap<String, Object> result = (HashMap)(parser.parse(userJSON.toString()));
         System.out.println(result);
         System.out.println(result.get("number"));
         System.out.println(result.get("id"));
      } catch (ParseException e) {
         e.printStackTrace();
      }
      
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
		
//		1. 상품 1개를 제작하여 JSON형식으로 변경
      Product goods = new Product(1, 1000, 10, "연필");
      JSONObject goodsJSON = new JSONObject(goods);
      System.out.println(goodsJSON);
      
//      2. JSON형식의 상품 정보 중 상품 재고 출력
      try {
		System.out.println(goodsJSON.get("stock"));
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
//		3. 할인 중인 상품 정보 제작
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
//		6. JSON에 할인율 필드 추가
//		7. JSON형식의 상품 정보 중 할인률 출력
      
      Product discountGoods = new Product(2, 1000, 10, "연필");
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







