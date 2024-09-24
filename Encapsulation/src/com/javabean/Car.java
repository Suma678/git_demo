package com.javabean;

// Using Constructor you can create object only once
public class Car {

	private int cost;

	public Car(int cost) {
		if (cost > 0) {
			this.cost = cost;
		}
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		if(cost>0) {
			this.cost = cost;
		}

}
