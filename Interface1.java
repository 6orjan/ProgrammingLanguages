
 interface Two_D_Shape{
	 static double PI = 3.14;
	
	 void parameters();
	 float area();
	 float perimeter();
}
 
 interface Three_D_Shape{
	 float volume();
 }

class Triangle implements Two_D_Shape{
	 int sideA, sideB, sideC, height;
	 Triangle(int a, int b, int c, int h)
	 {
		 sideA = a;
		 sideB = b;
		 sideC = c;
		 height = h;
		 System.out.println("A new triangle is created");
	 }
	 
	 boolean rectangular(double a, double b, double c) {
		 return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ? true : false);
	 }
	 
	@Override
	public void parameters() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
 }

class Sphere implements Two_D_Shape, Three_D_Shape{

	double radius;
	
	Sphere(double radius)
	{
		this.radius = radius;
		System.out.println("A new sphere has been created");
	}
	
	@Override
	public void parameters() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Triangle T1 = new Triangle(3,5,6,3);
		Sphere B1 = new Sphere(4);
		Two_D_Shape T2 = new Triangle(8,2,10,16);
		Two_D_Shape B2 = new Sphere(3);
		Three_D_Shape B3 = new Sphere(7);
		
	}

}
