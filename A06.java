import java.util.*;



    class A06 {

           String name;
	   int kor;
           int math;
           int eng;
           double avg;
           String score;


        void input(){
	
	Scanner A = new Scanner(System.in);
	System.out.println("이름 : ");
	this.name = A.next();

	System.out.println("국어점수 : ");
	this.kor = A.nextInt();

        System.out.println("수학점수 : ");
	this.math = A.nextInt();
 	
	System.out.println("영어점수 : ");
 	this.eng = A.nextInt();
 
        output();
	}

	void output(){
	
	this.avg = (kor+math+eng)/3.0;
	System.out.println("["+name+"] 님은\n");
	
	System.out.println("평균은 "+avg+"이고\n");

 	
	if(avg>=95) this.score = "A+";


        else if(avg>=90) this.score = "A";


        else if(avg>=85) this.score = "B+";

        else if(avg>=80) this.score = "B";

        else if(avg>=75) this.score = "C+";

        else if(avg>=70) this.score = "C";

        else if(avg>=65) this.score = "D+";

        else if(avg>=60) this.score = "D";

        else this.score = "F";

        System.out.println("학점은 "+score+" 입니다.");

        }

            public static void main(String[] args){

                new A06().input();

              }

             }

