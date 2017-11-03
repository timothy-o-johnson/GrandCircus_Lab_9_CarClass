import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		int numberOfCars = Validator.getInt(sc, "\nHow many cars are you entering? ", 1, 5);

		ArrayList<Car> carCollection = new ArrayList<Car>();
		
		for(int i = 0; i < numberOfCars; i++) {
			carCollection.add(new Car(sc, i));
		}
		
		System.out.println("\nSick car collection, bro/sis! \nLook at what you've got!");
		
		for(Car car: carCollection) {
			//System.out.printf("%s %s %d $%.0f", car.getMake(), car.getModel(), car.getYear(), car.getPrice());
			System.out.println(car);
		}
	}

}
