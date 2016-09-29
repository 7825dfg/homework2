import java.util.*;
   

     class B04{


         int kor;
	 int eng;
	 int math;
	 int sum;
	 double avg;

       void input(){
          
	  Scanner A = new Scanner(System.in);
	  System.out.println("국어 점수를 입력하세요");
	  this.kor= A.nextInt();

	  System.out.println("영어 점수를 입력하세요");
	  this.eng = A.nextInt();

          System.out.println("수학 점수를 입력하세요");
	  this.math = A.nextInt();

	  output();

	  }
	
        void output(){
	  this.sum = this.kor+this.eng+this.math;
	  this.avg = this.sum/3.0;
	  System.out.println(
	  "입력하신 점수의 총점은 "+sum+" 점 이고,\n 평균은"
	  +avg+" 점 입니다.");

	  if(kor>90){
	   System.out.println("국어 점수가 우수합니다.\n");
	   }
	  if(eng>90){
	   System.out.println("영어 점수가 우수합니다.\n");
	   }
          if(math>90){
	   System.out.println("수학 점수가 우수합니다.\n");
	   }
	   }

           public static void main(String[] args){
	     new B04().input();
	     }
	   }  

	  
	  

     
