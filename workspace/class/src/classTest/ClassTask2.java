package classTest;

//   �л���ȣ, ��������, ��������, ���������� �Է¹��� �� �� �հ� ��� ���ϱ�
class Student{
	int studentId;
	int koreanScore;
	int englishScore;
	int mathScore;
	int sum;
	double avg;
	
	Student(int Id, int score1, int score2, int score3){
		this.studentId = Id;
		this.koreanScore = score1;
		this.englishScore = score2;
		this.mathScore = score3;
		this.sum = koreanScore + englishScore + mathScore;
	    this.avg = this.sum / 3.0;
	}
}

public class ClassTask2 {
//   �ִ밪, �ּҰ� ���ϱ�
   void getMaxAndMin(int[] arData, Result result) {
      result.max = arData[0];
      result.min = arData[0];
      
      for (int i = 0; i < arData.length; i++) {
         if(result.max < arData[i]) {result.max = arData[i];}
         if(result.min > arData[i]) {result.min = arData[i];}
      }
   }
   
//	�л���ȣ, ��������, ��������, ���������� �Է¹��� �� �� �հ� ��� ���ϱ�
//	void getSumAndAvg(Student student){
//		student.sum = student.englishScore + student.koreanScore + student.mathScore;
//		student.avg = student.sum / 3;
//	}
//	
   
   public static void main(String[] args) {
//      Result result = new Result();
//      ClassTask2 classTask2 = new ClassTask2();
//      int[] arData = {1, 5, 3, 7, 8};
//      classTask2.getMaxAndMin(arData, result);
//      System.out.println(result.max);
//      System.out.println(result.min);
	   
	   Student student = new Student(190105, 90, 80, 70);
	   ClassTask2 classTask2 = new ClassTask2();
	   
	   System.out.println(student.sum);
	   System.out.println(student.avg);

	   
   }
}



















