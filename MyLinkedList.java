public class MyLinkedList{
    // Berperan sebagai Head
    private Node next;
    
    public void add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah, -1);
        } else {
            next.add(ygDitambah);
        }
    }
    
    public void tampilkan() {
            if (this.next == null) {
                System.out.println("LinkedList ini kosong gan");
            } else {
                System.out.print("[");
                next.tampilkan();
            }
    }
}
class Node{
    private int index;
    private int isiInt;
    private Node next;

    public Node(int isiInt, int index) {
        this.isiInt = isiInt;
        this.index = ++index;
    }

    public void add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah, this.index);
        } else {
            next.add(ygDitambah);
        }
    }

    public void tampilkan() {
        if (this.next == null) {
            System.out.println(this.isiInt + "]");
        } else {
            System.out.print(this.isiInt + ",");
            next.tampilkan();
        }
    }
}