
public class Assignement2 {
	
	
	interface Flyer{
		void takeoff();
		void land();
		void fly();
	}
	
	public static class Airplane implements Flyer{
		public void takeoff()
		{
			System.out.println("Airplane took off from Skopje");
		}
		public void land()
		{
			System.out.println("Airplane landed in Ohrid");
		}
		public void fly()
		{
			System.out.println("The airplane is flying at 10000 meters a.s.l");
		}
	}
	
	public static class Bird implements Flyer {
	    public void takeoff() {
	        System.out.println("Bird will take off from the next.");
	    }
	    public void land() {
	        System.out.println("Bird has landed on the nest.");
	    }
	    public void fly() {
	        System.out.println("Bird flies above Vardar.");
	    }
	    public void buildNest() {
	        System.out.println("The Bird has built its nest.");
	    }
	    public void layEggs() {
	        System.out.println("The Bird has layed eggs in the nest.");
	    }
	}


	public static class Superman implements Flyer {
	    public void takeoff() {
	        System.out.println("Superman takes off.");
	    }
	    public void land() {
	        System.out.println("Superman has landed.");
	    }
	    public void fly() {
	        System.out.println("Superman flies like an airplane.");
	    }
	    public void leapBuilding() {
	        System.out.println("Superman leaps the building like a piece of cake.");
	    }
	    public void stopBullet() {
	        System.out.println("Superman is bulletproof.");
	    }
	}

	
	public static void main(String[] args) {
		
		 	Airplane airplane = new Airplane();
	        airplane.takeoff();
	        airplane.land();
	        airplane.fly();

	        Bird bird = new Bird();
	        bird.takeoff();
	        bird.land();
	        bird.fly();
	        bird.buildNest();
	        bird.layEggs();

	        Superman superman = new Superman();
	        superman.takeoff();
	        superman.land();
	        superman.fly();
	        superman.leapBuilding();
	        superman.stopBullet();

	}

}
