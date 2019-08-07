package test;
class overload {
 int sum (int a,int b)	
{
	return(a+b);
}
 int sum(int a, int b, int c)
 {
	 return(a+b+c);
 }
}
class override{
	void show() {
		System.out.println("parent");
	}
}
class override1 extends override{
	void show() {
		System.out.println("child");
		
	}
}


public class Methodloadride {

	public static void main(String[] args) {
		
	overload s = new overload();
	System.out.println(s.sum(10, 20));
	System.out.println(s.sum(30,15,32));  

	override s2 = new override();
	override1 s1 = new override1();
	s2.show();
	s1.show();
	}

}
;