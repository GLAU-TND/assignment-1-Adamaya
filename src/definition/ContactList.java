package definition;

import adt.ContactListADT;

import java.util.ArrayList;

public class ContactList<Person> implements ContactListADT<Person> {
    private Node<Person> head;
    private int size = 0;
    ArrayList arrayOfNames = new ArrayList<String>();

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

    public void setName(String firstName, String lastName) {
        arrayOfNames.add(firstName + " " + lastName);
    }

    public ArrayList getArrayOfNames() {
        return arrayOfNames;
    }

    @Override
    public boolean add(Person personData) {
        add(size, personData);
        return true;
    }

    private Person removeFirst() {
        Person response = null;

        // store the head node's reference in a temp variable.
        Node<Person> temp = head;

        // check to see if the head isn't null.
        if (head != null) {

            // move the head node's reference to the immediate next node.
            head = head.getNext();
        }

        // return the old head node's data.
        // check to see if the temp variable isn't null.
        if (temp != null) {

            // decrease the size of the linked list
            size--;

            response = temp.getData();
        }

        return response;
    }


    private Person removeAfter(Node<Person> node) {
        Person response = null;

        // store the node to be deleted in a temp variable
        Node<Person> temp = node.getNext();

        // check if the temp variable is not null
        if (temp != null) {
            // change the next reference of the previous node
            node.next = temp.getNext();

            // decrease the size of the linked list
            size--;

            // set the data of the temp node (deleted node) to the response
            response = temp.getData();
        }
        if (temp == null) {
            node = null;
            size--;
        }
        return response;
    }

    @Override
    public boolean delete(int index) {
        boolean response = false;
        if (index - 1 < 0 || (index - 1) > getSize()) {
            throw new IndexOutOfBoundsException(Integer.toString(index - 1));
        } else if (index - 1 == 0) { /* check if the index is zero*/
            removeFirst();
            arrayOfNames.remove(index - 1);
            response = true;
        } else {
            Node<Person> previousNode = getNode(index - 1);
            removeAfter(previousNode);
            arrayOfNames.remove(index - 1);
            response = true;
        }
        return response;
    }


    @Override
    public boolean search(String name) {
        return false;
    }

    @Override
    public void viewAllContacts() {
        if (size != 0) {
            System.out.println("---Here are your all contacts---");
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
