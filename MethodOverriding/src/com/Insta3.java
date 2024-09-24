package com;

public class Insta3 extends Insta2 {
	
	@Override
	void images() {
		super.images();
		System.out.println("you can now can Upload Images, GIF and Videos as well");
	}

	@Override
	void directMessage() {
		super.directMessage();
		System.out.println("You can now be able to text and send Images as well");
		
	}
	
	void story() {
		System.out.println("Yoc can now upload Story");
	}
}
