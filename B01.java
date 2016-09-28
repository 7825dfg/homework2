import java.util.*;

   class B01{
     
      int age;

       void input(){
        Scanner A = new Scanner(System.in);
	System.out.println("태어난 년도를  적으시오");
	int birth = A.nextInt();
	this.age = 2014-birth+1;
	print();
	}

	void print(){
	 if(age>20)
	  System.out.println("미성년자가 아닙니다.");
	 else
	  System.out.println("미성년자 입니다.");
	  }

	  public static void main(String[] args){
	   
	    new B01().input();
	    }
        }
