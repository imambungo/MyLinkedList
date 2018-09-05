public class MyLinkedList{// Berperan sebagai Head
    private Node next;
    private Node tail;
    private Node beforeTail;
    
    public void clear() {
        this.next = null;
    }

    public boolean add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah, null);
            next.setObject(next);
            tail = next;
        } else {
            tail.next = new Node(ygDitambah, tail.getObject());
            tail.next.setObject(tail.next);
            beforeTail = tail;
            tail = tail.next;
        }
        return true;
    }

    // TODO change add(int,int) into non-recursive method
    public void add(int indexPermintaan, int ygDitambah) {
        if (this.next == null || indexPermintaan < 0) {
            System.out.println("Error: Index out of bound gan :v");
            if (this.next == null)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> LinkedList is empty");
            if (indexPermintaan < 0)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> Minimum index is 0");
            System.exit(0);
        } else if (indexPermintaan == 0) {
            Node sisip = new Node(ygDitambah, null);
            sisip.next = this.next;
            this.next = sisip;
        } else {
            next.add(indexPermintaan, ygDitambah, 1);
        }
    }
    
    public void tampilkan() {
        System.out.print("[");
        Node pointer = next;
        if (this.next != null) {
            System.out.print(next.getIsiInt());
            pointer = pointer.next;
        }
        while (pointer != null) {
            System.out.print(","+pointer.getIsiInt());
            pointer = pointer.next;
        }
        System.out.println("]");
    }

    // TODO change index(int) into non-recursive method
    public int index(int indexPermintaan) {
        if (this.next == null || indexPermintaan < 0) {
            System.out.println("Error: Index out of bound gan :v");
            if (this.next == null)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> LinkedList is empty");
            if (indexPermintaan < 0)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> Minimum index is 0");
            System.exit(0);
        }
        return next.index(indexPermintaan, 0);
    }

    // TODO change size() into non-recursive method
    public int size() {
        if (next == null) {
            return 0;
        }
        return next.size();
    }

    public void pop() {
        if (next != null){
            if (next.next == null) {
                next = null;
            } else {
                Node pointer = next;
                while (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next = null;
            }
        }
    }

    public Node pop2() {
        Node temp = null;
        if (next != null){
            if (next.next == null) {
                temp = next;
                next = null;
            } else {
                temp = tail;
                beforeTail.next = null;
                tail = beforeTail;
                beforeTail = beforeTail.before;
            }
        }
        return temp;
    }

    // TODO change hapus(int) into non-recursive method
    public void hapus(int indexPermintaan) {
        if (this.next == null || indexPermintaan < 0) {
            System.out.println("Error: Index out of bound gan :v");
            if (this.next == null)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> LinkedList is empty");
            if (indexPermintaan < 0)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> Minimum index is 0");
            System.exit(0);
        } else if (indexPermintaan == 0) {
            if (next.next == null)
                this.next = null;
            else
                this.next = next.next;
        } else {
            next.hapus(indexPermintaan, 1);
        }
    }
}
class Node{
    private int isiInt;
    private Node object;
    protected Node next;
    protected Node before;

    public Node(int isiInt, Node before) {
        this.isiInt = isiInt;
        this.before = before;
    }

    public void setObject(Node object) {
        this.object = object;
    }

    public Node getObject() {
        return this.object;
    }

    public int getIsiInt() {
        return this.isiInt;
    }

    // TODO change into non-recursive method
    public void add(int indexPermintaan, int ygDitambah, int indexNext) {
        if (next.next == null && indexPermintaan > indexNext) {
            System.out.println("Error: Index out of bound gan :v");
            System.out.println("\t.hapus(" + indexPermintaan + ") -> last index: " + indexNext);
            System.exit(0);
        } else if (indexPermintaan == indexNext) {
            Node sisip = new Node(ygDitambah, before);
            sisip.next = this.next;
            this.next = sisip;
        } else {
            next.add(indexPermintaan, ygDitambah, ++indexNext);
        }
    }

    // TODO change into non-recursive method
    public int index(int indexPermintaan, int indexIni) {
        if(indexPermintaan == indexIni) {
            return this.isiInt;
        }else if (this.next == null) {
            System.out.println("Error: Index out of bound gan :v");
            System.out.println("\t.index(" + indexPermintaan + ") -> last index: " + indexIni);
            System.exit(0);
        }
        return next.index(indexPermintaan, ++indexIni);
    }

    // TODO change into non-recursive method
    public int size() {
        if (next == null) {
            return 1;
        }
        return 1 + next.size();
    }

    // TODO change into non-recursive method
    public void hapus(int indexPermintaan, int indexNext) {
        if (next.next == null && indexPermintaan > indexNext) {
            System.out.println("Error: Index out of bound gan :v");
            System.out.println("\t.hapus("+indexPermintaan+") -> last index: "+indexNext);
            System.exit(0);
        } else if (indexPermintaan == indexNext) {
            if (next.next == null)
                this.next = null;
            else
                this.next = next.next;
        } else {
            next.hapus(indexPermintaan, ++indexNext);
        }
    }
}