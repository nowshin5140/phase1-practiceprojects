
package phase1;

public class Typecasting {

	public static void main(String[] args)
	{
			
		        // Implicit Type Casting
		        char x = 'X';
		        long y = x;
		        System.out.println("Implicit Type Casting: int to long");
		        System.out.println("x = " + x); // 100
		        System.out.println("y = " + y); // 100L
		        
		        // Explicit Type Casting
		        double a = 7.8;
		        int b = (int) a;
		        System.out.println("Explicit Type Casting: double to int");
		        System.out.println("a = " + a); // 3.14
		        System.out.println("b = " + b); // 3
		    }
		}
