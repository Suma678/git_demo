package primitivecasting;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("=====Widening=====");
		
		int a = 10;
		double b = a;
		System.out.println(a+" "+b);
		
		char c = 'A';
		int d = c;
		System.out.println(c+" "+d);
		
		System.out.println("=====Narrowing=====");
		double x = 3.45;
		int y = (int) x;
		System.out.println(x+" "+y);
		
		int p = 66;
		char q = (char)p ;
		System.out.println(p+" "+q);
		
		System.out.println("A"+" B"); // A B
		
		System.out.println("A"+20);// A20
		
		System.out.println('A'+'B');//65+66==>131
		
		System.out.println('a'+20);// char with number will get added ==> 117
		
		System.out.println('a'+"a");//String concatenated with character gives aa
	}
}



//ASCII --> American Standard Code for Information Interchange