package sguayaq;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
	private String breadRoll;
	private String meat;
	private double price;
	private List<String> burgerAdditionals = new ArrayList<String>();
	private double priceTotal;
	private double priceExtras;
	
	
	public Hamburger(String breadRoll, String meat, double price) {
		this.breadRoll = breadRoll;
		this.meat = meat;
		this.price = price;
	}
	
	
	public List<String> getBurgerAdditionals() {
		return burgerAdditionals;
	}



	public void checkBasePrice(){
		System.out.println("The base price is: "+price);
	}
	
	public void addExtras(String additional){
			
		if (burgerAdditionals.size()<4){
			burgerAdditionals.add(additional);			
		}
		else{
			System.out.println("Sorry, you're out of extras");
		}
	}
	
	public void getFinalPrice(){
		priceExtras = burgerAdditionals.size()*0.50;
		priceTotal = price + priceExtras;
		
		checkBasePrice();
		
		for(int i=0;i<burgerAdditionals.size();i++){
			System.out.println("Extra item #"+(i+1)+": "+burgerAdditionals.get(i));
		}
		System.out.println("Total price: "+priceTotal);
	}
}
