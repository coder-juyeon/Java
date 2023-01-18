package hashMapTest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
		JSONArray products = new JSONArray();
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
		
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
		Product goods = new Product(1, 1000, 10, "����");
		JSONObject goodsJSON = new JSONObject(goods);
		
		System.out.println(goodsJSON);
		
//		2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println(goodsJSON.get("stock"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		3. ���� ���� ��ǰ ���� ����
		Product discountGoods = new Product(2, 900, 2, "���찳");
		
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//		5. JSON�������� ����
//		6. JSON�� ������ �ʵ� �߰�
//		7. JSON������ ��ǰ ���� �� ���η� ���
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
