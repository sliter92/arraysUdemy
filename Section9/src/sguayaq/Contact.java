package sguayaq;

import java.util.ArrayList;

public class Contact {
	private String name;
	private int phone;
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public Contact(String name, int phone){
		this.name = name;
		this.phone = phone;
	}
	
	public Contact(){
		
	}
	
	public int findContact(String name){
		for(int i=0; i<contacts.size(); i++){
			if(name.equals(contacts.get(i).name)){
				return i;
			}
		}
		return -1;
	}
	
	public void searchContact(String name){
		int index = findContact(name);
		
		if(index>=0){
			System.out.println("Name: "+contacts.get(index).name+
					" Number: "+contacts.get(index).phone);
		}
		else{
			System.out.println("Contact doesn't exist");
		}
	}
	
	public void addContact(String name, int phone){
		if(findContact(name)<0){
			contacts.add(new Contact(name, phone));
			System.out.println("Contact Added ---> Name: "+name+" Number: "+phone);
		}
		else{
			System.out.println("Contact already exists");
		}
	}
	
	public void removeContact(String name){
		int index = findContact(name);
		if(index>=0){
			System.out.println("Contact Removed ---> Name: "+contacts.get(index).name+
					" Number: "+contacts.get(index).phone);
			contacts.remove(index);
		}
		else{
			System.out.println("Contact doesn't exist");
		}
	}
	
	public void printList(){
		for(int i=0; i<contacts.size(); i++){
			System.out.println("Contact #"+(i+1)+" Name: "+contacts.get(i).name+
					", Number: "+contacts.get(i).phone);
		}
	}
	
	public void modifyContact(String name, int phone){
		int index = findContact(name);
		
		if(index>=0){
			contacts.set(index, new Contact(name, phone));
			System.out.println("Contact Modified ---> Name: "+contacts.get(index).name+
					" Number: "+contacts.get(index).phone);
		}
		else{
			System.out.println("Contact doesn't exist");
		}
	}
	
}
