package phase1;

public class inner1 {

	 private String msg="Hii"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", My day is good");}  
	 }  


	public static void main(String[] args) {

		inner1 obj=new inner1();
		inner1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


class inner2 {

private String msg="Inner Classes";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	inner2  ob=new inner2 ();  
	ob.display();  
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}


