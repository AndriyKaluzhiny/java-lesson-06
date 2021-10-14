package ua.lviv.lgs.part2.interface2;

import ua.lviv.lgs.part2.interface1.Numerable;

public abstract class MyCalculator implements Numerable {
	@Override
	public void plus(int num) {
		// TODO Auto-generated method stub
		Numerable.super.plus(10);
	}
	
	@Override
	public void minus(int num) {
		// TODO Auto-generated method stub
		Numerable.super.minus(20);
	}
	
	@Override
	public void devide(int num) {
		// TODO Auto-generated method stub
		Numerable.super.devide(20);
	}
	
	@Override
	public void multiple(int num) {
		// TODO Auto-generated method stub
		Numerable.super.multiple(10);
	}
}
