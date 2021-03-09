package e_oop;

import java.util.Scanner;

public class TV {
   
   //과제. TV를 대상으로 클래스를 만들어주세요. 
   //대상이 가지고 있는 속성을 변수로 만들어라.
   //예를들면, 전원을 켜고 끈다. TV에는 채널이 있고 여러 채널을 돌아다닐 수 있다. 
   //볼륨을 키우고 줄인다.
   //변경하고 싶은 속성들을 변수로 만들고 만든속성들은 변경할 수 있어야 한다. 
   //그런 기능을 메서드로 만든다. 
   //메서드를 만들 때 만드는 기준은 리모컨의 버튼이다.
   //리모컨의 버튼이 메서드라고 생각하면 된다. 
   //채널 변경 메서드(숫자 입력하거나, 채널을 올렸다 내렸다 하거나 채널의 변경 방법은 두가지)
   //볼륨을 올리는 메서드, 내리는 메서드 
   
   
   int channel = 7; //인스턴스 채널 변수
   int sound = 30; //인스턴스 사운드 변수

   static Scanner s = new Scanner(System.in);
   
   public static void main(String[] args) {

   TV tv = new TV(); //TV 객체 생성
      int action = 0; //지역변수 action 
      while (true) {
         System.out.println();
         System.out.println("========================================리모컨=============================================");
         System.out.println("1.TV전원 ON\t2.TV전원 OFF\t3.채널 UP \t4.채널 DOWN\t5.볼륨UP  \t6.볼륨DOWN ");
         System.out.println("=========================================================================================");   
         System.out.print(">>원하는 기능을 입력하세요.");
         action = s.nextInt(); //숫자 입력 받음
         
         switch(action) {
         case 1:
            tv.tvon();
            break;
         case 2:
            tv.tvoff();
            System.exit(2);
         case 3:
            tv.chup();
            break;
         case 4:
            tv.chdown();
            break;
         case 5:
            tv.soundup();
            break;
         case 6:
            tv.sounddown();            
            break;
         default:
            System.out.println("입력이 올바르지 않습니다. ## 작동 오류 ##");
               
         }// switch문 닫힘

      }//while문 닫힘
   }//main 클래스 닫힘.
   
   //메서드 기능
   void tvon() {
      System.out.println("TV 전원을 켰습니다.");
   }

   void tvoff() {
      System.out.println("TV 전원을 껐습니다.");
   }

   void chup() {
      channel += 1;
      System.out.println(channel +"채널로 변경하였습니다.");
   }

   void chdown() {
      channel -= 1;
      System.out.println(channel +"채널로 변경하였습니다.");
   }

   void soundup() {
      sound += 1;
      System.out.println("현재 볼륨:"+sound);
   }

   void sounddown() {
      sound -= 1;
      System.out.println("현재 볼륨:"+sound);
      
   }
   
}//TV 클래스 닫힘
