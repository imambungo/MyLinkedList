public class Queue {
    MyLinkedList a = new MyLinkedList();

    public void insert(int value) {
        a.add(value);
    }

    public Node remove() {
        return a.removeFirst();
    }

    public void tampilkan() {
        a.tampilkan();
    }
}