package phase1;

public class stringfunctions {
	public static void main(String[] args){
		String msg = "Java Programming";//create string function
		System.out.println("String: " +msg);
		int length = msg.length(); //get the length of string
		System.out.println("Length: " +length);
		String first = "Hello"; //create first string
		System.out.println("First string: " +first);
		String second = "World"; //create second string
		System.out.println("Second string: " +second);
		String JoinedString = first.concat(second); //join two strings
		System.out.println("Joined String: " +JoinedString);
		System.out.println(first.compareTo(second));//compare
		System.out.println(first.toLowerCase());//lowercase
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Hello Java");
		s.append("World");
		System.out.println(s);

		
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("welcome to");
		sb1.append("elearning");
		System.out.println(sb1);
		
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}

	}
