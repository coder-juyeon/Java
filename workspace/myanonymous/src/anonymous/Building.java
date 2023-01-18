package anonymous;

public class Building {
	public static void main(String[] args) {
		StarBucks gangnam = new StarBucks();
		StarBucks jamsil = new StarBucks();
		
//		익명 클래스
//		구현되지 않은 필드를 구현하기 위해 일회성으로 생성된 클래스
		gangnam.register(new Form() {
			
//			입력받은 menu가 menus에 있으면 menu 판매완료 출력
			@Override
			public void sell(String menu) {
				String[] result = getMenu();
				for (int i = 0; i < result.length; i++) {
					if(result[i].equals(menu)) {
						System.out.println(result[i] + "판매완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노","라떼","아포카토"};
				return menus;
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노","라떼","아포카토"};
				return menus;
			}
		});
			
	}
}
