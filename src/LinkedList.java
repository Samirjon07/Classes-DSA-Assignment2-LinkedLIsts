// LinkedList.java   (singly linked list)
public class LinkedList {

    private Node head;
    private int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    // add <value> at the beginning of the linked list
    public void prepend(int value) {
        Node newNode = new Node( value);
        newNode.next = head;
        head =newNode;
        count++ ;
    }

    // add <value> at the end of the linked list
    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null ){
            head =newNode;
        } else {
            Node current = head;
            while (current.next !=null){
                current = current.next;}
            current.next= newNode;
        }
        count++;
    }

    public boolean isEmpty() {
        return count == 0; // returns true if the linked list is empty
    }//returns false otherwise

    public int size() {
        return count; //returns the size of the linked list
    }

    // inserts <value> at the <index> position of the linked list
    public void insertAt(int index, int value) {
        if (index <0 || index> count) {
            System.out.println("Invalid index, Please try again !");
            return;
        }
        Node newNode = new Node(value);
        if (index== 0) {
            newNode.next =head;
            head = newNode;
        } else {
            Node current= head;
            for (int i =0; i< index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        count++;
    }

    // deletes the value at the <index> position of the linked list
    public void deleteAt(int index) {
        if (index <0 || index>= count) {
            System.out.println("Invalid index. RETRY !");
            return;
        }

        if (index == 0) {
            head =head.next ;
        } else {
            Node current= head;
            for (int i= 0; i < index -1; i++) {
                current = current.next ;
            }
            current.next = current.next.next;
        }
        count--;
    }

    // returns the value at the <index> position of the linked list
    public int get(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index");
            return -1;  // simple error value
        }

        Node current = head;
        for (int i =0; i< index; i++ ) {
            current = current.next;
        }
        return current.data;
    }

    // pprint the current state of the linked list
    public String toString() {
        if (head == null) {
            return "empty";
        }

        String result = "";
        Node current = head;
        while (current != null) {
            result = result + current.data;
            if (current.next != null) {
                result =result +" ==== ";
            }
            current = current.next;
        }
        return result;
    }
}