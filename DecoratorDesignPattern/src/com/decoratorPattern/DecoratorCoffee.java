package com.decoratorPattern;

public abstract class DecoratorCoffee implements Coffee{
	
	protected Coffee coffee;
	DecoratorCoffee(Coffee coffee){
		this.coffee=coffee;
	}

	@Override
	public abstract void make();

	@Override
	public abstract int price();

}
