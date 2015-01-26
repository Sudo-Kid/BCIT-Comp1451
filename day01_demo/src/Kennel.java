import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */

/**
 * @author emetts
 *
 */

public class Kennel {
	
	private ArrayList<Dog> dogs;

	/**
	 * 
	 */
	public Kennel() {
		super();
		dogs = new ArrayList<Dog>();
	}
	
	public void addDog(Dog dog) {
		
		if(dog != null) {
			
			dogs.add(dog);
		}
	}
	
	public void display() {
		System.out.println("Dogs in the Kennel:");
		for (Dog dog : dogs) {
			System.out.println("Name: " + dog.getName());
			System.out.println("Breed: " + dog.getBreed());
			System.out.println("Age: " + dog.getAge());
			System.out.println();
		}
	}
	
	public Dog getRandomDog() {
		int randomDog = new Random().nextInt(dogs.size());
		
		if(dogs.get(randomDog) != null) {
			return dogs.remove(randomDog);
		} else {
			return null;
		}
	}
	
	public void adopt() {
		Dog dog;
		dog = getRandomDog();
		System.out.println("You adopted:");
		System.out.println("Name: " + dog.getName());
		System.out.println("Breed: " + dog.getBreed());
		System.out.println("Age: " + dog.getAge());
		System.out.println();
	}
}
