import java.util.*;



    class B03{
         

	int days;
	int seconds;
	int count;

	void input(){
	  Scanner A = new Scanner(System.in);
	  System.out.println("날수를 입력하세요.");
          this.days = A.nextInt(); 
	  this.seconds = this.days*60*60*24;
	  output();
	  }

	void output(){
	  System.out.println(
	  "날수에 해당되는 기간은 모두 "+seconds+" 초 입니다.");
	  
	  if(this.seconds>1000000){
	    this.count = this.seconds/1000000;
	    System.out.print(
	    "100만 초가 해당되는 기간은 모두 "+count+
	    " 번 입니다.");
	     }
	   }

	  public static void main(String[] args){
	    new B03().input();
	    }
	}


	  

