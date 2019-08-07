package test;

class sample{
	int a;
	String b;
	
	void insert(int n,String m)
	{
		a=n;
		b=m;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

public class a {
	public static void main(String[] args) {
		sample s = new sample();
		sample s1 = new sample();
		s.insert(10, "asd");
		s1.insert(20, "dasasfe");
		s.display();
		s1.display();
	}

}
