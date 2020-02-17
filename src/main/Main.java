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
        boolean flag;
        while (flag = true) {


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
                    System.out.println(contactList.add(person));
                    System.out.println(contactList.getSize());
                    break;
                case 2:
                    contactList.viewAllContacts();
            }

        }
    }
}
