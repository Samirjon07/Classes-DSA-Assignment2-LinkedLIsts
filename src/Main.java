public class Main {
    public static void main(String[] args ) {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.prepend(5);
        ll.insertAt(1, 7) ;
        System.out.println( ll) ;

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.prepend(0);
        System.out.println(dll);

        System.out.println(IsPalindrome.isPalindrome("radar") );
        System.out.println(IsPalindrome.isPalindrome("apple"));

        Queue q = new Queue();
        q.enqueue(100);
        q.enqueue(200);
        System.out.println(q.dequeue() );
    }
}