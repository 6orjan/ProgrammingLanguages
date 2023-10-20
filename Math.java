package chas4;
import java.lang.Math;
public class zadacha2 {

	public static void main(String[] args) {
		double value = 1.82234;
		System.out.println("The sine is " + Math.sin(value));
		System.out.println("The cosine is " + Math.cos(value));
		System.out.println("The tangent is " + Math.tan(value));
		System.out.println("The cotangent is " + 1/Math.tan(value));
		System.out.println("The square root is " + Math.sqrt(value));
		System.out.println("The square is " + Math.pow(value,2));
		System.out.println("The cube is " + Math.pow(value,3));
		System.out.println("The smallest integer " + Math.floor(value));
		System.out.println("The largest integer " + Math.ceil(value));
		double area = (value*value) * Math.PI;
		System.out.println("The area is" + area);
		System.out.println("PI " + Math.PI);
		System.out.println("E " + Math.E);
	}

}
