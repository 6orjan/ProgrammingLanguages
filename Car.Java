package myExample;

public class Vezba2 {
	
	static class Car{
		private String type;
		private int no_seats;
		private String fuel;
		private String body_color;
	Car(){
		type = "";
		no_seats = 0;
		fuel = "";
		body_color = ""; 
	}
	Car (String type, int seats, String fuel, String body_color)
	{
		this.type = type;
		this.no_seats = seats;
		this.fuel = fuel;
		this.body_color = body_color;
	}
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
		
	}
	
	public int getSeats()
	{
		return no_seats;
	}
	
	public void setSeats(int seats)
	{
		this.no_seats = seats;
		
	}
	
	public String getFuel()
	{
		return fuel;
	}
	
	public void setFuel(String fuel)
	{
		this.fuel = fuel;	
		
	}
	public String getBodyColor()
	{
		return body_color;
	}
	
	public void setBodyColor(String bodycolor)
	{
		this.body_color = bodycolor;	
		
	}
	
	public void spec()
	{
		System.out.println("The car is a " + this.getType() + " With this many seats: " + this.getSeats() + " This fuel type: " +this.getFuel() + " and this color " + this.getBodyColor());
	}
	
}
	
	public static void main(String[] args) {
			
		Car c1 = new Car("Fiat 500",4,"Diesel","pearl");
		Car c2 = new Car("Fiat 400",3,"Benzin","black");
		
		System.out.println("The first car is a " + c1.getType() + " With this many seats: " + c1.getSeats() + " This fuel type: " + c1.getFuel() + " and this color " + c1.getBodyColor());
		System.out.println("The first car is a " + c2.getType() + " With this many seats: " + c2.getSeats() + " This fuel type: " + c2.getFuel() + " and this color " + c2.getBodyColor());
		
		c2.setType("Volskwagen");
		c2.setSeats(2);
		c2.setFuel("Benzin");
		c2.setBodyColor("pink");
		
		System.out.println("The first car is a " + c2.getType() + " With this many seats: " + c2.getSeats() + " This fuel type: " + c2.getFuel() + " and this color " + c2.getBodyColor());
		
		if(c1.getSeats() > c2.getSeats())
		{
			System.out.println("Car 1 has more seats");
		}
		else if(c1.getSeats() < c2.getSeats()) {
			System.out.println("Car 1 has more seats");
		}
		else {
			System.out.println("They have the same amount of seats");
		}
		
		int no_cars = 2;
		Car[] Drivepark = new Car[no_cars];
		
		
		Drivepark[0] = new Car("Honda", 3, "Diesel","Cream");
		Drivepark[1] = new Car("Ford", 6, "Benzin","Red");
		System.out.println(Drivepark[1].getType());
	}
	
	

}
