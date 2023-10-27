package verificationTest;

public class animalZadacaaa {

	public static class Animal{
		public String name;
	
		public Animal(){
			name="";
			}
	
		public Animal(String n){
			name=n;
			}
	
		public void onomatopoeia() {
			System.out.println("There is no onomatopoeia for" + name);
		}
	}
	
	static class Dog extends Animal {
		public void onomatopoeia() {
			System.out.println("There is  onomatopoeia for dog" + name + " woof");
		}
	}
	
	static class Lion extends Animal {
		public void onomatopoeia() {
			System.out.println("There is  onomatopoeia for lion " + name + " rawr");
		}
	}
	
	static class Frog extends Animal {
		public void onomatopoeia() {
			System.out.println("There is  onomatopoeia for frog " + name + " ribbit");
		}
	}
	
	static class sara_mountain_dog extends Dog{
		public void onomatopoeia() {
			System.out.println("There is  onomatopoeia for special sara dog" + name + " woof woof");
		}
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Lion lion = new Lion();
		Frog frog = new Frog();
		sara_mountain_dog dog2 = new sara_mountain_dog();
		
		dog.onomatopoeia();
		lion.onomatopoeia();
		frog.onomatopoeia();
		dog2.onomatopoeia();
		
		
	}

}
