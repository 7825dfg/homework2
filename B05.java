import java.util.*;


       class B05 {
         
	  int age;
          int birth;
          String temp;
	  void input(){
	    Scanner A = new Scanner(System.in);
	    System.out.println("태어난 년도를 입력하시오.");
            
	    this.birth = A.nextInt();
            
	    output();
	    }

	   void output(){
	    
	    this.age = 2014-this.birth+1;

            if(age<7)
	     System.out.println("유아입니다.");
	    else if(age<13)
	     System.out.println("어린이입니다.");
	    else if(age<20)
	     System.out.println("청소년입니다.");
	    else if(age<30)
	     System.out.println("청년입니다.");
	    else if(age<60)
	     System.out.println("중년입니다.");
	    else
	     System.out.println("노인입니다.");


	    

	    }
	     public static void main(String[] args){
	       new B05().input();
	       }
	 }


