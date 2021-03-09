package j_collection;

import java.util.ArrayList;

public class ArrayListScoreSolution {

	public static void main(String[] args) {
		
		 ArrayList<String> students = new ArrayList();
		 students.add("허지영"); students.add("김민지"); students.add("김현우"); students.add("김동민");
		 
		 ArrayList<String> subjects = new ArrayList();
		 subjects.add("국어"); subjects.add("영어"); subjects.add("수학"); subjects.add("사회");
	      subjects.add("과학"); subjects.add("Oracle"); subjects.add("Java");
	      
	     ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
	  
	     //랜덤 값 생성
		for (int i = 0; i < students.size(); i++) {
			ArrayList<Integer> list = new ArrayList();
			for (int j = 0; j < subjects.size(); j++) {
				int random = (int) (Math.random() * 100) + 1;
				list.add(random);
				//list.add((int)(Math.random()* 101));
			}
			scores.add(list);
		}
		
		//합계 평균
		ArrayList<Integer> sums = new ArrayList();
		ArrayList<Double> avgs = new ArrayList();
		for(int i =0; i<scores.size(); i++){
			int sum =0;
			for(int j =0; j<scores.get(i).size(); j++){
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / subjects.size() * 100) / 100.0);
		}
		
		//석차
		ArrayList<Integer> ranks = new ArrayList();
		for(int i =0; i<sums.size(); i++){
			ranks.add(1); //rank는 1부터 시작해야 함. 
			for(int j =0; j<sums.size(); j++){
				if(sums.get(i) < sums.get(j)){
					ranks.set(i, ranks.get(i)+1);
				}
			}
		}
		
		//오름차순으로 정렬
		for(int i = 0; i < ranks.size() - 1; i++){
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++){
				if(ranks.get(j) < ranks.get(min)){
					min = j;
				}
			}
			
			String tempStudent = students.get(i);
			students.set(i, students.get(min));
			students.set(min, tempStudent);
			
			ArrayList<Integer> tempScore = scores.get(i);
			scores.set(i, scores.get(min));
			scores.set(min, tempScore);
			
			Integer tempSum = sums.get(i);
			sums.set(i, sums.get(min));
			sums.set(min, tempSum);
			
			Double tempAvg = avgs.get(i);
			avgs.set(i, avgs.get(min));
			avgs.set(min, tempAvg);
			
			Integer tempRank = ranks.get(i);
			ranks.set(i, ranks.get(min));
			ranks.set(min, tempRank);
		}
		
		//과목별 합계 석차
		ArrayList<Integer> subSums = new ArrayList();
		ArrayList<Double> subAvgs = new ArrayList();
		  for(int i = 0; i<subjects.size(); i++) {
			  int sum = 0;
			  for(int j=0; j<students.size();j++){
				  sum += scores.get(j).get(i);
			  }
			  subSums.add(sum);
			  subAvgs.add((double)sum/students.size());
		  }
		  
		//출력
		for (int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		for (int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			for (int j = 0; j < scores.get(i).size(); j++) {
				System.out.print("\t" + scores.get(i).get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t"
					+ ranks.get(i));
		}
		//과목 합계 평균
		System.out.print("과목합계");
		for(int i = 0; i < subSums.size(); i++){
			System.out.print("\t" + subSums.get(i));
		}
		System.out.print("\n과목평균");
		for(int i = 0; i < subAvgs.size(); i++){
			System.out.print("\t" + subAvgs.get(i));
		}
	}
}
