package j_collection;

import java.awt.List;
import java.util.ArrayList;

public class Score {

   public static void main(String[] args) {
      /*
       * 22명의 이름 
       * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 정수를
       * 0~100까지 랜덤으로 생성해주시고, 아리와 같이 출력해주세요.
       * 
       * 
       *        국어      영어      수학      사회      과학      Oracle       Java   합계; k++      평균      석차
       * 홍길동    90      90      90      90      90      90         90      630      90.00   1
       * 홍길동    90      90      90      90      90      90         90      630      90.00   1
       * 홍길동    90      90      90      90      90      90         90      630      90.00   1
       * 홍길동    90      90      90      90      90      90         90      630      90.00   1
       * 홍길동    90      90      90      90      90      90         90      630      90.00   1
       * 과목합계 450      450      450      450      450      450         450
       * 과목평균 90.00   90.00   90.00   90.00   90.00   90.00      90.00
       * 
       */
      
      ArrayList<String> name = new ArrayList();
      name.add("허지영"); name.add("김민지"); name.add("김현우"); name.add("김동민"); name.add("배현태");
      name.add("여인욱"); name.add("김동희"); name.add("김인혁"); name.add("이영섭"); name.add("정선영");
      name.add("김용진"); name.add("이지향");
      
      ArrayList<String> subjects = new ArrayList();
      subjects.add("국어"); subjects.add("영어"); subjects.add("수학"); subjects.add("사회");
      subjects.add("과학"); subjects.add("Oracle"); subjects.add("Java");
      
      //2차원 list사용
      ArrayList<ArrayList<Integer>> score = new ArrayList<>();
      ArrayList<Integer> list = new ArrayList<>();
      
      //점수 입력 및 합계 평균
      for (int j = 0; j < name.size(); j++) {
         list = new ArrayList<>();
         int sum =0;
         int avg = 0;
         
         for (int i = 0; i < subjects.size(); i++) {
            int random = (int) (Math.random() * 100) + 1;
            list.add(random);
            sum += random;
         }
         avg = sum / subjects.size();
         list.add(sum);
         list.add(avg);
         score.add(list);
      }
      
      for(int i =0; i<subjects.size(); i++){
    	  System.out.print("\t" + subjects.get(i));
      }
      System.out.println("\t합계\t평균\t석차");
      
      //접수 출력 및 합계 평균 출력
      for (int j = 0; j < name.size(); j++) {
         for (int i = 0; i < subjects.size() + 2; i++) {
        	 System.out.print("\t");
            System.out.print(score.get(j).get(i));
         }
         
         System.out.println();
      }
      
      //rank
/*      for (int j = 0; j < name.size(); j++) {
         int rank = 1;
         for (int i = 0; i < subjects.size(); i++) {
            System.out.print(score.get(j).get(i) + " ");
            if(list.get(j) < list.get(i)) {
               rank++;
            }
         }
      }
   
      //각 과목의 합 평균
      ArrayList<Integer> subSum = new ArrayList<>();
      ArrayList<Integer> subAvg = new ArrayList<>();
      for(int i = 0; i<subjects.size(); i++) {
         int sum = 0;
         int avg = 0;
         for(int j = 0; j< score.size(); j++) {
            sum += score.get(j).get(i);
            subSum.add(sum);
         }
         avg = sum / score.size();
         subAvg.add(avg);
      }*/
      
      //오름차순 정렬
    /*  for (int i = 0; i < list.size() - 1; i++) {
         int m = i;
         for (int j = i + 1; j < list.size(); j++) {
            if (list.get(j) < list.get(m)) {
               m = j;               
            }
         }
         int temp = list.get(i);
         list.set(i, list.get(m)); //i번째에 덮어씌움
         list.set(m, temp);
      }
      System.out.println(list);*/
      

   }

}