package basic12.interface03;

public class FlyingCar implements Drivable,Flyable {

	@Override
	public void fly() {
		System.out.println("fly~!");
	}

	@Override
	public void drive() {
		System.out.println("driving");
	}

}
