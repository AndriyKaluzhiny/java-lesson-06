package ua.lviv.lgs.part1;

public class Application {
	
	public static void main(String[] args) {
		Worker w = new Worker("Steven", "Apple", 25, 7, 3000, 30000);
		
		w.fixedMounthPayment();
		w.hourPayment();
	}
	
	
	
}
