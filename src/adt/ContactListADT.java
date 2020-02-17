package adt;

public interface ContactListADT<Person> {
    boolean add(Person person);

    boolean delete(int index);

    boolean search(String name);

    void viewAllContacts();
}
