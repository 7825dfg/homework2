import java.util.*;
    
     class B02 {
        double f_deg;
	double c_deg;
        double ran;
        String what;
	 void input(){
	   Scanner A = new Scanner(System.in);
	   System.out.println("온도를 입력하세요.");
	   this.ran = A.nextDouble();

	   System.out.println("섭씨면 c, 화씨면 f를 입력하세요.");
	   this.what = A.next();
	   print();
	   }

	   void print(){
	   if(this.what.equals("c")){
	   this.c_deg = this.ran;
	   this.f_deg = (this.c_deg*1.8)+32;
	   System.out.println("변환된 온도는"+f_deg+" 입니다");
	   }
	   else{
	   this.f_deg = this.ran;
	   this.c_deg = (this.f_deg-32)/1.8;
	   System.out.println("변환된 온도는"+c_deg+" 입니다");
	   }
	   } 
	   public static void main(String[] args){
	    new B02().input();
	    }
	  } 




  
	  

