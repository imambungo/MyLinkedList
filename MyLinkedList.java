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

    public int index(int index) {
        if (this.next == null || index < 0) {
            try {
                throw new IndexOutOfBoundsException("Index ini tidak ada gan :v");
            }
            catch (IndexOutOfBoundsException e) {
                // System.out.println(e.getMessage());                
            }
        }
        return next.index(index);
    }

    public int length() {
        if (next == null) {
            return 0;
        }
        return next.length();
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

    public int index(int index) {
        if(this.index == index) {
            return this.isiInt;
        }else if (this.next == null) {
            try {
                throw new IndexOutOfBoundsException("Index ini tidak ada gan :v");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        return next.index(index);
    }

    public int length() {
        if (next == null) {
            return 1;
        }
        return 1 + next.length();
    }
}