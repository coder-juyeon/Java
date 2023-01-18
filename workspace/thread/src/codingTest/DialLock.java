package codingTest;

public class DialLock {
//	현재 눈금선에 있는 숫자 P, 비밀번호 S -> 매개변수
//	최소 회전 횟수를 return 하는 solution 함수 완성
//	비밀번호 길이: 1000자리 이하의 자연수
	
//	0,1,2,3, <-4 5-> 6,7,8,9
//	4이하이면 역방향 5면 어디든 상관없음 6이상이면 정방향
//	최소 회전 횟수 구하는법
//	총 다이얼 회전 횟수는 20번 있는 것이므로 
//	정방향 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 역방향 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
//	이라고 가정하고
//	비밀번호의 첫번째 자리와 현재 눈금선에 있는 숫자 비교
	
//	눈금선 숫자가 작을때
//	눈금선 숫자를 10 더하고
//	만약 눈금선에 있는 숫자와 비밀번호의 숫자를 뺏을때 4이하이면 역방향 5면 어디든 상관없음 6이상이면 정방향
//	예) 눈금선 첫번째: 5 -> 15 비밀번호 첫번째: 9 15-9 -> 6  정방향 (6,7,8,9)
//	예) 눈금선 첫번째: 0 -> 10 비밀번호 첫번째: 8 10-8 -> 2  역방향 (9,8)
//	예) 눈금선 첫번째: 2 -> 12 비밀번호 첫번째: 7 12-6 -> 5  정방향 (3,4,5,6,7) 역방향 (1,0,9,8,7)
//	눈금선 숫자 비밀번호 자리수로 초기화
	
//	눈금선 숫자가 클때
//	만약 눈금선에 있는 숫자와 비밀번호의 숫자를 뺏을때 4이하이면 역방향 5면 어디든 상관없음 6이상이면 정방향
//	예) 눈금선 첫번째: 8 비밀번호 첫번째: 1 8-1 -> 7  정방향 (9,0,1)
//	예) 눈금선 첫번째: 9 비밀번호 첫번째: 5 9-5 -> 4 역방향 (8,7,6,5)
//	예) 눈금선 첫번째: 5 비밀번호 첫번째: 0 5-0 -> 5 정방향, 역방향 상관없음
	
//	눈금선과 비밀번호 숫자가 같을때
//	count 0
	
//	count -> 정방향일때 10에서 나머지를 뺀것
//			역방향일때는 빼고 난 나머지가 된다.
//			상관없을일때는 5가 된다.
//	예) 상관없음: 나머지 5 -> 5
//	예) 정방향: 나머지 7 -> 7-4 3
//	예) 역방향: 나머지 2 -> 2
	
//	방향 표시 예)정방향 = 1 역방향 = -1 상관없음 = 0
	int direction = 0;
	int count = 0;
	
//	count 구하기
	public int countNum(int sub) {
		int count = 0;
		if(sub <= 4) {
			direction = -1;
			count = sub;
		}
		else if(sub >= 6) {
			direction = 1;
			count = 10 - sub;
		}
		else {
			direction = 0;
			count = 5;
		}
		System.out.println("방향: "+ direction);
		System.out.println("카운트: "+ count);
		return count;
	}
	
//	비밀번호의 첫번째 자리와 현재 눈금선에 있는 숫자 비교
	public int solution(int p ,String s) {
		for (int i = 0; i < s.length(); i++) {
			int sNum = s.charAt(i) - '0';
			System.out.println("현재 눈금선 숫자: " + p);
			System.out.println("비밀번호" + (i+1) + "번째 수: " + sNum);
			
			if(p < sNum) {
				p += 10;
				int sub = p - sNum;
				count += countNum(sub);
				p = sNum;
			}
			
			else if(p > sNum) {
				int sub2 = p - sNum;
				count += countNum(sub2);
				p = sNum;
			}
			
			else {
				count += 0;
				p = sNum;
				System.out.println("현재 같은 숫자이므로 회전하지 않습니다.(count 증가X)");
			}
			
			System.out.println("카운트 합계: " + count);
			System.out.println("--------------");
		}
		return count;
	}
	
	public static void main(String[] args) {
		DialLock dialLock = new DialLock();
		int result= 0;

		result = dialLock.solution(9, "8193034");
		System.out.println("카운트 총 합계: " + result);
		
		
	}
	
//	강사님 코드
//	public int solution(String p, String s) {
//	      int answer = 0;
//	      
//	      for (int i = 0; i < s.length(); i++) {
//	         int number = p.charAt(i), target = s.charAt(i), result = target - number;
//	         answer += Math.abs(result) > 4 ? 10 - result : Math.abs(result);
//	      }
//	      return answer;
//	   }
}
