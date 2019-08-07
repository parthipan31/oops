package test;
  
interface Drawable{  
	void draw();  
}  

interface Drawable1{
	void show();
}
 
class Rectangle implements Drawable,Drawable1{  
	public void draw()
		{
			System.out.println("drawing rectangle");
		}  
	public void show()
	{
		System.out.println(" rectangle show ");
	}
}  
class Circle1 implements Drawable{  
	public void draw()
		{
		 System.out.println("drawing circle");
		}  
	}  
 
class interface1{  
	public static void main(String args[]){  
		Rectangle r = new Rectangle();
//		Drawable d=new Rectangle(); 
//		Drawable1 d1 = new Rectangle();
		r.draw(); 
		r.show();
		}
	}