import java.util.*;
import java.util.stream.*;

public class StudentMap2 {
	public static class Student {
	    String name;
	    int indexNo;
	    int age;

	    Student(String name, int indexNo, int age) {
	        this.name = name;
	        this.indexNo = indexNo;
	        this.age = age;
	    }
	}
	public static class Demo {
	    Student createStudent(String name, int indexNo, int age) {
	        return new Student(name, indexNo, age);
	    }

	    void printValues(Student s) {
	        System.out.println("Name: " + s.name);
	        System.out.println("Index Number: " + s.indexNo);
	        System.out.println("Age: " + s.age);
	    }
	public static void main(String[] args) {
			
		  Demo demo = new Demo();
	        List<String> names = Arrays.asList("Borjan", "Blagoja", "Bojan", "Filip", "Drugiot Filip");
	        Random rand = new Random();

	        names.stream()
	            .map(name -> demo.createStudent(name, rand.nextInt(10000) + 1, rand.nextInt(13) + 18))
	            .forEach(demo::printValues);
	    }
	}

}
