package chaining;

public class Demo {
	Demo(int a){
		this();
		System.out.println(1);
	}
	
	Demo(){
		
		System.out.println(2);
	}
	public static void main(String[] args) {
		
		System.out.println("Start");
		new Demo(10);    //Demo d = new Demo();
		System.out.println("End");
	}
}
