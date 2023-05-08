package phase1;

class C {
	public int p;
	int q ;
	private int r;
	
	public C(int a,int b,int c)
	{
		p=a;
		q=b;
		r=c;
	}
	public void display() {
		System.out.println("The value of p: " +p);
		System.out.println("The value of q: " +q);
		System.out.println("The value of r: " +r);
		System.out.println();
	}
}
