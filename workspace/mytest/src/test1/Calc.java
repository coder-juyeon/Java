package test1;
//여러개의 정수를 입력받아서 알맞는 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//음수와 양수 0 도 받아야됨
//사용자가 정수를 입력해야됨
//그 입력한 정수를 Integer.parseInt 로 int로 바꿔주고 (calc 메서드)
//정수들을 더해줌 (음수도 다 더해주면 됨 어차피 음수가 빼기니까) (static 메소드)
//

@FunctionalInterface
public interface Calc {
	public int stringToInt(Application data);
}
