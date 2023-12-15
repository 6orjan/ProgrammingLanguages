import java.util.*;
import java.util.stream.*;

public class StudentMap22 {
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
	        List<String> names = Arrays.asList("Jovan", "Bigorski", "Joakim", "Osogovski", "Petar", "Pavel", "Lebron");
	        Random rand = new Random();

	        List<Student> students = names.stream()
	            .map(name -> demo.createStudent(name, rand.nextInt(10000) + 1, rand.nextInt(13) + 18))
	            .collect(Collectors.toList());

	        List<Student> studentsStartingWithP = students.stream()
	            .filter(s -> s.name.startsWith("P"))
	            .collect(Collectors.toList());

	        studentsStartingWithP.forEach(demo::printValues);

	        boolean allStudentsYoungerThan25 = students.stream().allMatch(s -> s.age < 25);
	        System.out.println("All students are younger than 25: " + allStudentsYoungerThan25);

	        boolean allStudentsOlderThan25 = students.stream().allMatch(s -> s.age > 25);
	        System.out.println("All students are older than 25: " + allStudentsOlderThan25);

	        boolean atLeastOneStudentYoungerThan25 = students.stream().anyMatch(s -> s.age < 25);
	        System.out.println("At least one student is younger than 25: " + atLeastOneStudentYoungerThan25);
	    }
	}

}

