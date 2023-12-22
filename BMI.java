import java.util.Scanner;
import java.time.Year;

public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter name");
		 String name = scanner.nextLine();
		 
		 System.out.print("Enter your age");
	     int age = scanner.nextInt();
	        
	     System.out.print("Enter your height");
	     double height = scanner.nextDouble();
	     
	     System.out.print("Enter your weight ");
	     double weight = scanner.nextDouble();
	     
	     double BMI = (weight / (height * height));
	     
	     System.out.println("Name is " + name);
	     System.out.println("Age is " + age);
	     System.out.println("BMI is " + BMI);
	     
	     scanner.close();
	     
	}

}
