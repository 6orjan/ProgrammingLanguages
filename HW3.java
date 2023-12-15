package ass1;
import java.io.*;
import java.util.Date;
public class Test {
	public static void main(String[] args) {
        
        Employee employee = new Employee();
        employee.setFirstName("Borjan");
        employee.setLastName("Georgievski");
        employee.setDob(new Date()); 
        employee.setEmployeeId(5501);
        employee.setDepartment("Software engineering");
        employee.setSecurityClearance(10);
        
        
        System.out.println("Before Serialization this is what happens ");
        System.out.println("Name " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Date of birth " + employee.getDob());
        System.out.println("EID " + employee.getEmployeeId());
        System.out.println("Department of work " + employee.getDepartment());
        System.out.println("Security Clearance number " + employee.getSecurityClearance());

      
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employees.txt"))) {
            oos.writeObject(employee);
            System.out.println("Serialization success");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employees.txt"))) {
            Employee deserializedEmployee = (Employee) ois.readObject();

            
            System.out.println("After Deserialization:");
            System.out.println("Name " + deserializedEmployee.getFirstName() + " " + deserializedEmployee.getLastName());
            System.out.println("Date of birth " + deserializedEmployee.getDob());
            System.out.println("EID " + deserializedEmployee.getEmployeeId());
            System.out.println("Department of work " + deserializedEmployee.getDepartment());
            System.out.println("Security Clearance number " + deserializedEmployee.getSecurityClearance());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
