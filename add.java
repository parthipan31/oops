package test;

public class add {

		add()
		{
			System.out.println("ads");
		}
		public void finalize()
		{
			System.out.println("destructor");
		}
	public static void main(String[] args) {
		add a=new add();
		a.finalize();
	
	}

}
