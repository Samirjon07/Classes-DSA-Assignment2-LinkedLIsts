public class DoublyLinkedList {

    private Node head;
    private int count;

    public DoublyLinkedList() { // this is a constructor
        head = null;
        count = 0;
    }
 // i just change some parts of the singly linked list functions
    public void prepend(int value) {
        Node newNode = new Node(value );
        newNode.next= head;
        if (head != null) {
            head.prev =newNode;
        }
        head= newNode;
        count++;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (head== null) {
            head = newNode;
        } else {
            Node current = head ;
            while (current.next != null) {
                current= current.next;}
            current.next = newNode;
            newNode.prev = current;}
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void insertAt(int index, int value) {
        if (index < 0 || index > count) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(value);

        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
        count++;
    }

    public void deleteAt(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        count--;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index");
            return -1;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public String toString() {
        if (head== null) {
            return "empty";
        }

        String result = "";
        Node current =head;
        while (current != null) {
            result = result + current.data;
            if (current.next!= null) {
                result = result+ " ==== ";
            }
            current= current.next;
        }
        return result;
    }
}