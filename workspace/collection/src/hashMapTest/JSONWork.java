package hashMapTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
		JSONArray products = new JSONArray();
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
		
//		1. 상품 1개를 제작하여 JSON형식으로 변경
		Product goods = new Product(1, 1000, 10, "연필");
		JSONObject goodsJSON = new JSONObject(goods);
		
		System.out.println(goodsJSON);
		
//		2. JSON형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println(goodsJSON.get("stock"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		3. 할인 중인 상품 정보 제작
		Product discountGoods = new Product(2, 900, 2, "지우개");
		
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
//		6. JSON에 할인율 필드 추가
//		7. JSON형식의 상품 정보 중 할인률 출력
		double discount = 0.5;
		JSONObject discountJSON = new  JSONObject(discountGoods);
		try {
			discountJSON.put("discount", discount);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		System.out.println(discountJSON);

	}
}
