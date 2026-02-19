public class Queue {
    // since my queue is in python, i wrote it like that

    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void enqueue(int value) {
        list.append(value);
    }

    public int dequeue() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = list.get(0);
        list.deleteAt(0);
        return value;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}