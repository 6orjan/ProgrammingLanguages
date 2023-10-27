package verificationTest;

public class classVExericseII {

	public static class Egg{
		public void Egg() {
			System.out.println("Each egg has an albumen and yolk");
		}
		public void print() {
			System.out.println("An egg is a nutritional product");
		}
	}
	public static class ostrich_egg extends Egg{
		public void Egg() {
			System.out.println("The ostrich egg has the largest albumen and yolk");
		}
	}
	public static void main(String[] args) {
		Egg henegg = new Egg();
		Egg ostrichegg = new ostrich_egg();
		henegg.Egg();
		henegg.print();
		ostrichegg.Egg();
	}

}
