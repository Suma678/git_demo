package com;

//first inherit the class then you can inherit as many interface class as possible
//conccrete class must be given first priority
public class Employee extends TestYantra implements Jspiders,Qspiders {

	@Override
	public void develop() {
		System.out.println("Developing App");
	}
	@Override
	public void test() {
		System.out.println("Testing App");
	}
	public static void main(String[] args) {
		//optionally override work() 
		Employee e = new Employee();
		
		e.develop();
		e.test();
		e.work();
	}
}
