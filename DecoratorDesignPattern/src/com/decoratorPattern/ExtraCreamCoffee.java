package com.decoratorPattern;

public class ExtraCreamCoffee extends DecoratorCoffee {

	ExtraCreamCoffee(Coffee coffe) {
		super(coffe);
		
	}

	@Override
	public void make() {
		coffee.make();
		System.out.println(" + extra cream added to the normal coffee");
		
	}

	@Override
	public int price() {
		
		return coffee.price()+50;
	}

}
