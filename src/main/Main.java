package main;

import definition.ContactList;
import definition.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();
        String firstName;
        String lastName;
        String[] contactNumber = new String[3];
        String email;
        boolean flag = true;
        while (flag == true) {


            System.out.println("welcome to Adam's contact list");
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the Person");
                    System.out.println("First Name:");
                    firstName = scanner.nextLine();
                    System.out.println("Last Name:");
                    lastName = scanner.nextLine();
                    contactList.setName(firstName, lastName);
                    contactList.setFirstNameInList(firstName);
                    System.out.println("Contact Number:");
                    contactNumber[0] = scanner.nextLine();
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Would you like to add new Number?");
                        char response = scanner.next().charAt(0);
                        if (response == 'y') {
                            contactNumber[i] = scanner.next();
                        } else {
                            break;
                        }
                    }
                    System.out.println("Enter the Email:");
                    email = scanner.next();
                    Person person = new Person(firstName, lastName, contactNumber, email);
                    contactList.add(person);
                    break;
                case 2:
                    contactList.viewAllContacts();
                    break;
                case 3:
                    System.out.println("You could search for a contact from there contact name");
                    String name = scanner.next();
                    contactList.search(name);
                    break;
                case 4:
                    System.out.println("Here are your contacts");
                    for (int i = 0; i < contactList.getArrayOfNames().size(); i++) {
                        System.out.println((i + 1) + ". " + contactList.getArrayOfNames().get(i));
                    }
                    System.out.println("Press the number against the contact to delete it: ");
                    int index = scanner.nextInt();
                    String tempName = contactList.getArrayOfNames().get(index - 1).toString();
                    contactList.delete(index);
                    System.out.println(tempName + " has been deleted from your contacts");
                    break;
                case 5:
                    System.out.println("Thank You For Using Our Services");
                    flag = false;
                    break;
                default:
                    System.out.println("Invailid Input enter the right input:");
                    break;
            }

        }
    }
}
