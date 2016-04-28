package sguayaq;

public class Main {

	public static void main(String[] args) {
		Hamburger burger = new Hamburger("White", "Double", 9);
		burger.addExtras("Tomato");
		burger.addExtras("Bacon");
		burger.addExtras("Pickles");
		burger.addExtras("Mushrooms");
		burger.addExtras("Onions");
		burger.getFinalPrice();
		
		HealthyBurger healthyB = new HealthyBurger("Turkey");
		healthyB.addExtras("Tomato");
		healthyB.addExtras("Bacon");
		healthyB.addExtras("Pickles");
		healthyB.addExtras("Mushrooms");
		healthyB.addExtras("Onions");
		healthyB.addExtras("Lettuce");
		healthyB.addExtras("Pinnaples");
		healthyB.getFinalPrice();
		
		DeluxeBurger deluxeB = new DeluxeBurger("Soft","Single");
		deluxeB.getFinalPrice();

	}

}
