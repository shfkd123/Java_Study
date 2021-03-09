package e_oop.score;

public class Student {

	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	int rank;

	
	void std(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Student student = new Student(); // Student 클래스 객체 생성
			// 학생 한명의 점수
			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);

			student.sum = student.m_sum(student.kor, student.eng, student.math);
			student.avg = student.m_avg(student.sum);

			students[i] = student;
			
			return;

		}
	}
	
	void rank (Student[] students) {
		
		std(students);
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
		
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].sum > students[min].sum) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
		}
	}
	

	// 합계구하기
	int m_sum(int a, int b, int c) {
		return a + b + c;
	}

	// 평균구하기
	double m_avg(int a) {
		return Math.round(a / 3.0 * 100) / 100.0;
	}

	// 출력
}
