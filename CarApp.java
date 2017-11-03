import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Tim Johnson
 * Grand Circus
 * 11/2/17
 * Lab9_Cars
 *
 */
public class CarApp {

	/*
	 * Application will
	 * 1. ask user how many cars they want to enter
	 * 2. for each car, take input for the details
	 * 3. print out a table of the cars at the end
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		int numberOfCars = Validator.getInt(sc, "\nHow many cars are you entering? ", 1, 5);

		ArrayList<Car> carCollection = new ArrayList<Car>();
		
		for(int i = 0; i < numberOfCars; i++) { 
			carCollection.add(new Car(sc, i));
		}
		
		System.out.println("\nSick car collection, bro/sis! \nLook at what you've got! (Make/ Model/ Year/ Price)");
		
		for(Car car: carCollection) {
			System.out.println(car);
		}
	}

}
