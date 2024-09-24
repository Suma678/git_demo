package hierarchial;

public class Test {

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.brand+" "+c.cost);
		c.start();
		
		System.out.println("===================");
		
		Bike b = new Bike();
		System.out.println(b.brand+" "+b.fuel);
		b.stop();
	}

}
