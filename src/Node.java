public class Node {
        int data;
        Node next;
        Node prev; //this part will only be used in Double LINKED Lists, since they have previous, data, and next

        public Node(int data) {
            this.data = data ;
            this.next = null;
            this.prev = null ;
        }
    }

