import java.util.Scanner;


public class TwoDimension {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter number of rows");
	        int rows = scanner.nextInt();

	        System.out.print("Enter number of columns");
	        int columns = scanner.nextInt();

	        
	        int[][] array = new int[rows][columns];

	      
	        int sum = 0;

	        try {
	            

	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < columns; j++) {
	                    System.out.print("Enter element at  [" + i + "][" + j + "]: ");
	                    array[i][j] = scanner.nextInt();
	                    sum += array[i][j];
	                }
	            }

	         
	            double average = (double) sum / (rows * columns);

	            
	            System.out.println("The sum of the elements is " + sum);
	            System.out.println("The average of the elements is " + average);

	        } catch (Exception e) {
	            System.out.println("Error");
	        } finally {
	          
	            scanner.close();
	        }

	}

}
