package definition;

import adt.ContactListADT;

public class ContactList<Person> implements ContactListADT<Person> {
    private Node<Person> head;
    private int size = 0;

    private void addFirst(Person personData) {
        head = new Node<>(personData, head);
        size++;
    }

    private void addAfter(Node<Person> personNode, Person personData) {
        personNode.next = new Node<>(personData, personNode.next);
        size++;
    }

    public int getSize() {
        return size;
    }

    public void add(int index, Person personData) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (size == 0) {
            addFirst(personData);
        } else {
            Node<Person> temp = getNode(index - 1);
            addAfter(temp, personData);
        }
    }

    private Node<Person> getNode(int index) {
        Node<Person> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    @Override
    public boolean add(Person personData) {
        add(size, personData);
        return true;
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
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                // fetch the data for the current node
                Person data = this.getNode(i).getData();
                System.out.print(data);
            }
        } else {
            System.out.println("NO RESULTS FOUND!");
        }
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
