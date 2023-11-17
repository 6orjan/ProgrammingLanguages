
 interface Two_D_Shape {
    float PI = 3.14f;
    void parameters();
    float area();
    float perimeter();
}

interface Three_D_Shape {
    float volume();
}

class Triangle implements Two_D_Shape {
    float sideA, sideB, sideC, height;

    Triangle(float sideA, float sideB, float sideC, float height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        System.out.println("A new triangle is created");
    }

    public void parameters() {
        System.out.println("Side A: " + sideA + ", Side B: " + sideB + ", Side C: " + sideC + ", Height: " + height);
    }

    public float area() {
        return 0.5f * height * sideA;
    }

    public float perimeter() {
        return sideA + sideB + sideC;
    }

    boolean rectangular() {
        return Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2);
    }
}

class Sphere implements Two_D_Shape, Three_D_Shape {
    float radius;

    Sphere(float radius) {
        this.radius = radius;
        System.out.println("A new sphere has been created");
    }

    public void parameters() {
        System.out.println("Radius: " + radius);
    }

    public float area() {
        return 4 * PI * radius * radius;
    }

    public float perimeter() {
        return 2 * PI * radius;
    }

    public float volume() {
        return (4/3) * PI * radius * radius * radius;
    }
}

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Triangle T1 = new Triangle(3,5,6,3);
        T1.parameters();
        System.out.println("Area: " + T1.area());
        System.out.println("Perimeter: " + T1.perimeter());
        System.out.println("Is Rectangular: " + T1.rectangular());

        Sphere B1 = new Sphere(4);
        B1.parameters();
        System.out.println("Area: " + B1.area());
        System.out.println("Perimeter: " + B1.perimeter());
        System.out.println("Volume: " + B1.volume());

        Two_D_Shape T2 = new Triangle(8,2,10,16);
        T2.parameters();
        System.out.println("Area: " + T2.area());
        System.out.println("Perimeter: " + T2.perimeter());

        Two_D_Shape B2 = new Sphere(3);
        B2.parameters();
        System.out.println("Area: " + B2.area());
        System.out.println("Perimeter: " + B2.perimeter());

        Three_D_Shape B3 = new Sphere(7);
        System.out.println("Volume: " + B3.volume());
	}

}
