package phase1;

 class paraconstuctor {
	 int id;
		String name;
		paraconstuctor(int i,String n){
			id =i;
			name =n;
		}
			void display()
		{System.out.println(id+" "+name);}
		
		public static void main(String args[]) {
			paraconstuctor s1 =new paraconstuctor(111,"karan");
			paraconstuctor s2 =new paraconstuctor(222,"Aryan");
			s1.display();
			s2.display();
			
		}

	}



