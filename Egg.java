package verificationTest;

public class classVExericseII {

	 static class Egg{
		public void printEgg() {
			System.out.println("Each egg has an albumen and yolk");
		}
		public void print() {
			System.out.println("An egg is a nutritional product");
		}
		int category;
		public Egg (int c) {
			category = c;
		}
		public int getCategory() {
			return category;
		}
	}
	 static class ostrich_egg extends Egg{
		public ostrich_egg(int c) {
			super(c);
			
		}

		public void Egg() {
			System.out.println("The ostrich egg has the largest albumen and yolk");
		}
	}
	public static void main(String[] args) {
		Egg henegg = new Egg(1);
		Egg ostrichegg = new ostrich_egg(2);
		System.out.println("For the hen's egg: ");
		henegg.printEgg();
		henegg.print();
		System.out.println("The category is: " + henegg.category);
		
		System.out.println("For the ostrich egg: ");
		ostrichegg.printEgg();
		ostrichegg.print();
		System.out.println("The category is: " + ostrichegg.category);
	}

}
