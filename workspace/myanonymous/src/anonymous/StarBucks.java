package anonymous;

//��Ÿ���� ����
public class StarBucks {
	public void register(Form form){
		String[] menus = form.getMenu();
		
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("���ᳪ�� ������Դϴ�.");
		}
		form.sell("����ī��");
	}
}

