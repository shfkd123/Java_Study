package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 22명의 이름 
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 정수를
		 * 0~100까지 랜덤으로 생성해주시고, 아리와 같이 출력해주세요.
		 * 
		 * 
		 * 		국어		영어		수학		사회		과학		Oracle 		Java	합계		평균		석차
		 * 홍길동	 90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동	 90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동	 90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동	 90		90		90		90		90		90			90		630		90.00	1
		 * 홍길동	 90		90		90		90		90		90			90		630		90.00	1
		 * 과목합계 450		450		450		450		450		450			450
		 * 과목평균 90.00	90.00	90.00	90.00	90.00	90.00		90.00
		 * 
		 * */
				
			String name[] = {"김민지","서주형","최윤성","변형균","김두환","현유진","김현슬","이광렬","박예진",
								"강건우","명민호","박상영","이휘로","김현태","최영준","정영인",
								"정유진","공슬기","김이현","전윤주","전재수","유은지","과목합계","과목평균"};
		
		int[][] scores = new int[24][7];
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		int[] rank = new int[scores.length]; // 석차

		System.out.println("\t국어\t영어\t수학\t사회\t과학\t오라클\tJava\t합계\t평균\t석차");

		// 석차
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.print(name[i]);
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101); // 점수
				System.out.print("\t" + scores[i][j]);
				sum[i] += scores[i][j];
				if (scores[i][j] < scores[i][j]) {
					rank[i]++;
				}
			}

			avg[i] = Math.round((double) sum[i] / scores[i].length * 10) / 10.0;
			System.out.print("\t" + sum[i] + "\t" + avg[i] + "\t" + rank[i]);
			System.out.println();
		}
		//"과목합계","과목평균"
		int summ =0;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
			summ+= scores[i][j];
			}
			System.out.print("\t"+summ);
		}
		
	}
}
