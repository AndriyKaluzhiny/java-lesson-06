package ua.lviv.lgs.part2.interface2;

public class Application {
	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator() {};
		
		calculator.plus(10);
		calculator.minus(20);
		calculator.multiple(10);
		calculator.devide(20);
	}
}
