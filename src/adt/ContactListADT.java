package adt;

public interface ContactListADT<Person> {
    boolean add(Person person);

    boolean delete(String personFirstName);

    boolean search(String name);

    void viewAllContacts();
}
