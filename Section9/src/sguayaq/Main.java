package sguayaq;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	public static Contact contact = new Contact();

	private static void printInstructions(){
		System.out.println("Welcome to your phone, please select your option");
		System.out.println("0 - Show options");
		System.out.println("1 - Print contacts");
		System.out.println("2 - Add contact");
		System.out.println("3 - Remove contact");
		System.out.println("4 - Modify contact");
		System.out.println("5 - Quit");
	}

	private static void addContact(){

		System.out.println("Please enter the name: ");
		String inName = scanner.nextLine();

		System.out.println("Please enter the phone number: ");
		int inPhone = scanner.nextInt();

		contact.addContact(inName, inPhone);
	}

	private static void removeContact(){

		System.out.println("Please enter the name: ");
		String inName = scanner.nextLine();

		contact.removeContact(inName);
	}
	
	private static void modifyContact(){
		System.out.println("Please enter the name: ");
		String inName = scanner.nextLine();

		System.out.println("Please enter the phone number: ");
		int inPhone = scanner.nextInt();

		contact.modifyContact(inName, inPhone);
	}

	public static void main(String[] args) {

		/*ArrayChallenge arrayC = new ArrayChallenge();

		int[] testArray = arrayC.sortIntegers(arrayC.getIntegers(4));
		arrayC.printArray(testArray);*/


		boolean flag = true;
		int choice = 0;

		printInstructions();
		while(flag){
			System.out.println("Enter your option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch(choice){
			case 0:
				printInstructions();
				break;
			case 1:
				contact.printList();
				break;
			case 2:
				addContact();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				modifyContact();
				break;
			case 5:
				flag = false;
				break;
			}
		}

	}

}
