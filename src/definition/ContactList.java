package definition;

import adt.ContactListADT;

public class ContactList<Person> implements ContactListADT<Person> {
    @Override
    public boolean add(Person person) {
        return false;
    }

    @Override
    public boolean delete(Person person) {
        return false;
    }

    @Override
    public boolean search(String name) {
        return false;
    }

    @Override
    public void viewAllContacts() {

    }
}
