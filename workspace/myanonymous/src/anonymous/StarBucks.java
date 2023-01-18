package anonymous;

//스타벅스 본사
public class StarBucks {
	public void register(Form form){
		String[] menus = form.getMenu();
		
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 행사중입니다.");
		}
		form.sell("아포카토");
	}
}

