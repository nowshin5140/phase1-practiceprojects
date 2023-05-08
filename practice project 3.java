package phase1;
public class methodExecution {

public int multipynumbers(int a,int b) {
	int c=a+b;
	return c;
}

public static void main(String[] args) {

	methodExecution b=new methodExecution();
	int ans= b.add(10,3);
	System.out.println("additionis :"+ans);
	}


public static class callbyvalue {

		int val=75;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}

		public static void main(String args[]) {
			callbyvalue d = new callbyvalue();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			}
}
}
	




