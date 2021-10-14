package ua.lviv.lgs.part1;

public class Worker implements Payment{
	String name;
	String company;
	int age;
	double workinghours;
	int HourPayment;
	int MonthPayment;
	
	public Worker(String name, String company, int age, double workinghours, int HourPayment, int MonthPayment) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.workinghours = workinghours;
		this.HourPayment = HourPayment;
		this.MonthPayment = MonthPayment;
	}

	@Override
	public void hourPayment() {
		System.out.println("Payment per day(Payment per Hour: " + HourPayment + "): " + (workinghours*HourPayment));
	}

	@Override
	public void fixedMounthPayment() {
		System.out.println("Payment per Month: " + MonthPayment);
	}
	
	
}
