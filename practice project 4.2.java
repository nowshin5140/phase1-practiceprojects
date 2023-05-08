package phase1;

class defaultconstructor {
	int id;
	String name;
	void display()
	{System.out.println(id+" "+name);}
	
	public static void main(String args[]) {
		defaultconstructor s1 =new defaultconstructor();
		defaultconstructor s2 =new defaultconstructor();
		s1.display();
		s2.display();
		
	}

}
