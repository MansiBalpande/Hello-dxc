package abstraction;

/**
 * car's manoverability is defined in an abstract
 * @author admin
 *
 */

public abstract class FlyingCar {
	
	public void startCar() {
		System.out.println("put the key and rotate ignition");
	}
	public abstract void StopCar();
	public abstract void flyCar();
	public abstract void landCar();

}
