package test1;
//�������� ������ �Է¹޾Ƽ� �˸´� ����, ���� ����� Ȯ���ϴ� ���ø����̼� ����
//������ ��� 0 �� �޾ƾߵ�
//����ڰ� ������ �Է��ؾߵ�
//�� �Է��� ������ Integer.parseInt �� int�� �ٲ��ְ� (calc �޼���)
//�������� ������ (������ �� �����ָ� �� ������ ������ ����ϱ�) (static �޼ҵ�)
//

@FunctionalInterface
public interface Calc {
	public int stringToInt(Application data);
}
