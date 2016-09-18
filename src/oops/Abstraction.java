package oops;
/**
 * This class demonstrate Abstraction
 * Abstraction- Hide the internal implementation(complexities) and highlight the set of services (essentials).
 * Advantages- Security improvement, Maintainability increased, Easiness to use the system, 
 * 
 * @author Mukesh Kumar Maurya
 *
 */
public class Abstraction {

	public static void main(String[] args) {
		Audi audi= new Audi();
		System.out.println("Model Name: "+audi.getModelName());
		System.out.println("Color: "+audi.getColor());
		System.out.println("No. of wheels: "+audi.getNoOfWheels());
		System.out.println("Price: $"+audi.getPrice());
		System.out.println(audi.getOtherSpecs());

	}

}

//full abstraction
interface Car{
	String getModelName();
	String getColor();
	String getOtherSpecs();	
}

abstract class AbstractCar implements Car{
	abstract public int getPrice();
	public int getNoOfWheels(){
		return 4;
	}
}

class Audi extends AbstractCar{

	public String getModelName() {
		return "Audi A8";
	}

	public String getColor() {
		return "Black";
	}

	public String getOtherSpecs() {
		return "ENGINE TYPE: twin-turbocharged DOHC 32-valve V-8, aluminum block and heads, direct fuel injection."
				+ "\n Displacement: 244 cu in, 3991 cc."
				+ "\n TRANSMISSION: 8-speed automatic with manual shifting mode.";
	}

	public int getPrice() {
		return 96200;
	}
	
}
