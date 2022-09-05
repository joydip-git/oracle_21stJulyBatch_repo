/**
 * 
 */

/**
 * @author satarupa
 *
 */
public class Bike {
	int speed;
	static int maxSpeed;
	static {
		maxSpeed = 150;
		System.out.println(maxSpeed);
	}
	{
		maxSpeed=160;
		speed = 100;
		System.out.println(speed);
		System.out.println(maxSpeed);
	}

	{
		System.out.println("another");
	}

	public Bike() {
		// super();
		/*
		 * { speed = 100; System.out.println(speed); }
		 */
		speed = 70;
		System.out.println(speed);
	}

	public Bike(int _speed) {
		// super();
		/*
		 * { speed = 100; System.out.println(speed); }
		 */
		speed = _speed;
		System.out.println(speed);
	}
	
	public static void showMaxSpeed() {
		//System.out.println(maxSpeed);
		System.out.println("static method");
	}
}
