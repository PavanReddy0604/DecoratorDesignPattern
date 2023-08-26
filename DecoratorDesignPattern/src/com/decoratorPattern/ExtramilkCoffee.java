package com.decoratorPattern;

public class ExtramilkCoffee extends DecoratorCoffee {
	
	ExtramilkCoffee(Coffee coffe){
		super(coffe);
	}
	@Override
	public void make() {
		coffee.make();
		System.out.println(" + extra milk added to the normal coffee");
		
	}

	@Override
	public int price() {
		
		return coffee.price()+20;
	}

}
