package programs;

class Car {
	int cost;
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.cost);
		System.out.println(c2.cost);
		
		c1.cost=20;
		c2.cost=30;
		
		System.out.println(c1.cost+" "+c2.cost);
	}
}
