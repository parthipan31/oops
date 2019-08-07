package test;
	abstract class shape{
		void show() {
			System.out.println(" show");	
			}
		abstract void draw();
	}
	
	class circle extends shape{
		void draw()	{
		System.out.println("circle draw");	
		}
	}
	
	class square extends shape{
		void draw() {
			System.out.println("draw square");
		}
	}

public class abstractclass {

	public static void main(String[] args) {
		
		circle c = new circle();
		square n = new square();
		
		c.draw();
		c.show();
		n.draw();
	}

}
