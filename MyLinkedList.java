public class MyLinkedList{// Berperan sebagai Head
    private Node next;
    
    public void add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah);
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

    public int index(int indexPermintaan) {
        if (this.next == null || indexPermintaan < 0) {
            try {
                throw new IndexOutOfBoundsException("Index out of bound gan :v");
            }
            catch (IndexOutOfBoundsException e) {
                // System.out.println(e.getMessage());                
            }
        }
        return next.index(indexPermintaan, 0);
    }

    public int length() {
        if (next == null) {
            return 0;
        }
        return next.length();
    }

    public void pop() {
        if (next != null)
            if (next.next == null)
                next = null;
            else
                next.pop();
    }
}
class Node{
    private int isiInt;
    protected Node next;

    public Node(int isiInt) {
        this.isiInt = isiInt;
    }

    public void add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah);
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

    public int index(int indexPermintaan, int indexIni) {
        if(indexPermintaan == indexIni) {
            return this.isiInt;
        }else if (this.next == null) {
            try {
                throw new IndexOutOfBoundsException("Index out of bound gan :v");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        return next.index(indexPermintaan, ++indexIni);
    }

    public int length() {
        if (next == null) {
            return 1;
        }
        return 1 + next.length();
    }

    public void pop() {
        if (next.next == null)
            next = null;
        else
            next.pop();
    }
}