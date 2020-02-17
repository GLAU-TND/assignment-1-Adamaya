package definition;

import adt.ContactListADT;

public class ContactList<Person> implements ContactListADT<Person> {
    private static class Node<Person> {
        private Person data;
        private Node<Person> next;

        public Node(Person data, Node<Person> next) {
            this.data = data;
            this.next = next;
        }

        public Person getData() {
            return data;
        }

        public void setData(Person data) {
            this.data = data;
        }

        public Node<Person> getNext() {
            return next;
        }

        public void setNext(Node<Person> next) {
            this.next = next;
        }
    }

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
