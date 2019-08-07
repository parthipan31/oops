package test;

class vehicle
{
	void name() {
		System.out.println("tata");
	}
}

class vehicletype extends vehicle
{
	void type() {
		System.out.println("car");
	}
}

class segment extends vehicletype
{
	void segmenttype()
	{
		System.out.println("sedan");
	}
}

public class inheritance {

	public static void main(String[] args) {
		
		segment s = new segment();
		s.segmenttype();
		s.type();
		s.name();

	}

}
