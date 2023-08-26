package com.decoratorPattern;

public class BaseCoffee  implements Coffee{

	@Override
	public void make() {
		System.out.print("normal coffee");
		
	}

	@Override
	public int price() {
		return 50;
		
	}

}
