package ua.lviv.lgs.part2.interface1;

public interface Numerable extends Plus, Minus, Devide, Multiple {
	@Override
	default void plus(int num) {
		System.out.println(num + 10);
	}
	
	@Override
	default void minus(int num) {
		System.out.println(num - 10);
	}
	
	@Override
	default void multiple(int num) {
		System.out.println(num * 10);
	}
	
	@Override
	default void devide(int num) {
		System.out.println(num / 10);
	}
}
