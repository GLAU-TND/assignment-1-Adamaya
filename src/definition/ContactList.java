package definition;

import adt.ContactListADT;

public class ContactList<Person> implements ContactListADT<Person> {
    private Node<Person> head;
    private int size = 0;

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

    private static class Node<Person> {
        private Person data;
        private Node<Person> next;

        private Node(Person data, Node<Person> next) {
            this.data = data;
            this.next = next;
        }

        private Person getData() {
            return data;
        }

        private void setData(Person data) {
            this.data = data;
        }

        private Node<Person> getNext() {
            return next;
        }

        private void setNext(Node<Person> next) {
            this.next = next;
        }
    }
}
