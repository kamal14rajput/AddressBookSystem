package com.bridgelabz;
import java.util.Scanner;

public class NewContacts {

	public static void main(String[] args) {
		PersonContact details = new PersonContact();
		details.operations();
	}
}

class PersonContact{
	public void operations(){
		String arrayInput[] = new String[100];
		int numOfContactDetails = 0;
		Scanner sc = new Scanner(System.in);
		int i = 0,j=1,choice;	
		System.out.println("Create a contact list");
		System.out.println("Enter how many contact details you want to create");
		numOfContactDetails = sc.nextInt();
		int numOfDetails = numOfContactDetails;
			while(numOfDetails > 0) {
				System.out.println("For Person"+j);
				System.out.println("Add first name");
				arrayInput[i++] = sc.next();
				System.out.println("Add last name");
				arrayInput[i++] = sc.next();
				System.out.println("Add address");
				arrayInput[i++] = sc.next();
				System.out.println("Add state");
				arrayInput[i++] = sc.next();
				System.out.println("Add zip");
				arrayInput[i++] = sc.next();
				System.out.println("Add phone number");
				arrayInput[i++] = sc.next();
				System.out.println("Add email");
				arrayInput[i++] = sc.next();
				numOfDetails--;
				j++;
				}
			System.out.println("Enter operations you want to perform contact list");
			System.out.println("1)Add new contacts");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				int numOfAddedContacts;
				System.out.println("Enter how many contact details you want to add");
				numOfAddedContacts = sc.nextInt();
				int numOfAddedCon = numOfAddedContacts;
					while(numOfAddedCon > 0) {
						System.out.println("For Person"+j);
						System.out.println("Add first name");
						arrayInput[i++] = sc.next();
						System.out.println("Add last name");
						arrayInput[i++] = sc.next();
						System.out.println("Add address");
						arrayInput[i++] = sc.next();
						System.out.println("Add state");
						arrayInput[i++] = sc.next();
						System.out.println("Add zip");
						arrayInput[i++] = sc.next();
						System.out.println("Add phone number");
						arrayInput[i++] = sc.next();
						System.out.println("Add email");
						arrayInput[i++] = sc.next();
						numOfAddedCon--;
						j++;
						}
				System.out.println();
				System.out.println("Contact Details are ");
				for(i = 0; i < (numOfContactDetails + numOfAddedContacts) * 7; i++) {
					System.out.println(arrayInput[i]);
				}
				break;
		}
	}
}
