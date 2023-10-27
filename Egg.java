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
	}
	 static class ostrich_egg extends Egg{
		public ostrich_egg(int c) {
			super(c);
			System.out.println("A constructor of ostrich_egg that utilizes the constructor of egg");
		}

		public void Egg() {
			System.out.println("The ostrich egg has the largest albumen and yolk");
		}
	}
	public static void main(String[] args) {
		Egg henegg = new Egg(1);
		Egg ostrichegg = new ostrich_egg(1);
		henegg.printEgg();
		henegg.print();
		ostrichegg.printEgg();
	}

}
