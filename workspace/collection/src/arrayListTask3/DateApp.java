package arrayListTask3;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {
	Love love = new Love();
	ArrayList<Love> loves = DateDBConnecter.loves;
	
//	����� ���
	public void addUser(Love love) {
		loves.add(love);
	}
	
//	����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
//	���ϴ� ���̸� �Է¹ް�
//	���̰� ���� ��ü�� �޾��ش�.
	public ArrayList<Love> ageList(int age) {
		ArrayList<Love> list = new ArrayList<Love>();
		for (Love love : loves) {
			if(love.getAge() == age){
				list.add(love);
			}
		}
		return list;
	}
	
	
//	�̻����� ���� ����
//	�Է��� ��ȣ�� DB�� ��ȣ�� ������
//	DB ���̸� �Է��� ���̷� �ٲٱ�
	public void updateAge(Love love) {
		for (Love loveInDB : loves) {
			if(loveInDB.getIndex() == love.getIndex()) {
				loveInDB.setAge(love.getAge());
			}
		}
	}
	
	
//	�̻��� ���� �� ����
//	public void orderByAge() {
////		�̻������� ���̸� ���� �ڷᱸ��
//		ArrayList<Integer> arData = new ArrayList<Integer>();
//		for (int i = 0; i < loves.size(); i++) {
//			arData.add(i, loves.get(i).getAge());
//		}
////		������������ ����
//		Collections.sort(arData);
//		
////		DB�� �ִ� �̻������� ���� ������ ������ ���
//		ArrayList<Love> results = new ArrayList<Love>();
//		
//		for (Love love : results) {
//			
//		}
//	}
	public void sort() {
//      DB�� �ִ� �̻������� ���� ������ ������ ���
      ArrayList<Love> results = new ArrayList<Love>();
      
//      �̻������� ���̸� ���� �ڷᱸ��
      ArrayList<Integer> ages = new ArrayList<Integer>();
      
//      loves���� ���̸� �����ͼ� ages�� �߰�
      for (Love love : loves) {
         ages.add(love.getAge());
      }
      
//      ������������ ����
      Collections.sort(ages);
      
      for (int age : ages) {
         for (int i=0; i<loves.size(); i++) {
            if(loves.get(i).getAge() == age) {
               results.add(loves.get(i));
//               �ߺ��� �Ǵ°� �������ָ� �ȵǴϱ� ���Ŵ� �� ��󿡼� �ƿ� ��������
               loves.remove(loves.get(i));
            }
         }
      }
      loves = results;
   }
}
