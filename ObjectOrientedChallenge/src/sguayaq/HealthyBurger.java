package sguayaq;

public class HealthyBurger extends Hamburger{
	
	private static String healthyRoll = "Brown Rye";
	private static String healthyMeat;
	private static double healthyPrice = 10.50;

	public HealthyBurger(String meat) {
		super(healthyRoll, meat, healthyPrice);
		this.healthyMeat = meat;
	}
	
	@Override
	public void checkBasePrice(){
		System.out.println("The price for the healthy burger is: "+healthyPrice);
	}

	@Override
	public void addExtras(String additional) {
		if (getBurgerAdditionals().size()<6){
			getBurgerAdditionals().add(additional);			
		}
		else{
			System.out.println("Sorry, you're out of extras");
		}
	}
	
	

}
