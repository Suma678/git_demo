package chaining;

class Son extends Father {
	
	Son(){
		
		super(10);/*needs to be called explicitly if the super class has a parameterized constructors
		otherwise will get Compile Time Error*/
		//super(); implicitly called for nonParameterized constructors
		System.out.println(2);
	}

}
