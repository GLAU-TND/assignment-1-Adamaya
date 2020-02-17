package adt;

public interface ContactListADT<Person> {
    boolean add(Person person);

    boolean delete(Person person);

    boolean search(String name);

    void viewAllContacts();
}
