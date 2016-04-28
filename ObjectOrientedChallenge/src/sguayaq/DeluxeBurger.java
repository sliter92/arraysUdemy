package sguayaq;

public class DeluxeBurger extends Hamburger{
	
	private static double price = 8.75;

	public DeluxeBurger(String breadRoll, String meat) {
		super(breadRoll, meat, price);
		
		super.addExtras("Chips");
		super.addExtras("Drink");
	}
	
	

}
