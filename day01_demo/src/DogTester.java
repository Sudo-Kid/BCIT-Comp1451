
public class DogTester {

	public static void main(String[] args) {
		
		Kennel kennel = new Kennel();
		Dog dog1 = new Dog("Dog1", "GSD", 1);
		Dog dog2 = new Dog("Dog2", "GSD", 2);
		Dog dog3 = new Dog("Dog3", "GSD", 3);
		Dog dog4 = new Dog("Dog4", "GSD", 4);
		Dog dog5 = new Dog("Dog5", "GSD", 5);
		Dog dog6 = new Dog("Dog6", "GSD", 6);
		
		
		kennel.addDog(dog1);
		kennel.addDog(dog2);
		kennel.addDog(dog3);
		kennel.addDog(dog4);
		kennel.addDog(dog5);
		kennel.addDog(dog6);
		
		
//		kennel.display();
		
		kennel.adopt();
		kennel.adopt();
		
//		kennel.display();
	}

}
