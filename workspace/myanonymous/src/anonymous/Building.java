package anonymous;

public class Building {
	public static void main(String[] args) {
		StarBucks gangnam = new StarBucks();
		StarBucks jamsil = new StarBucks();
		
//		�͸� Ŭ����
//		�������� ���� �ʵ带 �����ϱ� ���� ��ȸ������ ������ Ŭ����
		gangnam.register(new Form() {
			
//			�Է¹��� menu�� menus�� ������ menu �ǸſϷ� ���
			@Override
			public void sell(String menu) {
				String[] result = getMenu();
				for (int i = 0; i < result.length; i++) {
					if(result[i].equals(menu)) {
						System.out.println(result[i] + "�ǸſϷ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = {"�Ƹ޸�ī��","��","����ī��"};
				return menus;
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				String[] menus = {"�Ƹ޸�ī��","��","����ī��"};
				return menus;
			}
		});
			
	}
}
