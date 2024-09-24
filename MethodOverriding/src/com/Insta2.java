package com;

public class Insta2 extends Insta1 {
	
	@Override
	void images() {
		super.images();
		System.out.println("Upload Images and GIF");
	}
	
	void directMessage() {
		
		System.out.println("You can now Direct message anyone");
	}
}
