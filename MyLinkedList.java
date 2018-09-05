public class MyLinkedList{// Berperan sebagai Head
    private Node next;
    private Node tail;
    private int size;
    
    public void clear() {
        this.next = null;
        this.size = 0;
    }

    public boolean add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah, null);
            tail = next;
        } else {
            tail.next = new Node(ygDitambah, tail);
            tail = tail.next;
        }
        this.size++;
        return true;
    }

    public void addFirst(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah, null);
            tail = next;
        } else {
            Node sisip = new Node(ygDitambah, null);
            sisip.next = this.next;
            this.next = sisip;
        }
        this.size++;
    }

    public Node removeFirst() {
        Node temp = next;
        if (this.next != null) {
            next = next.next;
            temp.next = null;// apakah harus pakai ini?
            this.size--;
        }
        return temp;
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
        this.size++;
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
    public int get(int indexPermintaan) {
        if (this.next == null || indexPermintaan < 0) {
            System.out.println("Error: Index out of bound gan :v");
            if (this.next == null)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> LinkedList is empty");
            if (indexPermintaan < 0)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> Minimum index is 0");
            System.exit(0);
        }
        return next.get(indexPermintaan, 0);
    }

    public int size() {
        return this.size;
    }

    public Node removeLast() {
        Node temp = null;
        if (next != null){
            if (next.next == null) {
                temp = next;
                next = null;
            } else {
                temp = tail;
                tail.previous.next = null;
                tail = tail.previous;
            }
        }
        this.size--;
        return temp;
    }

    // TODO change hapus(int) into non-recursive method
    public void remove(int indexPermintaan) {
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
            next.remove(indexPermintaan, 1);
        }
        this.size--;
    }
}
class Node{
    private int isiInt;
    protected Node next;
    protected Node previous;

    public Node(int isiInt, Node previous) {
        this.isiInt = isiInt;
        this.previous = previous;
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
            Node sisip = new Node(ygDitambah, previous);
            sisip.next = this.next;
            this.next = sisip;
        } else {
            next.add(indexPermintaan, ygDitambah, ++indexNext);
        }
    }

    // TODO change into non-recursive method
    public int get(int indexPermintaan, int indexIni) {
        if(indexPermintaan == indexIni) {
            return this.isiInt;
        }else if (this.next == null) {
            System.out.println("Error: Index out of bound gan :v");
            System.out.println("\t.index(" + indexPermintaan + ") -> last index: " + indexIni);
            System.exit(0);
        }
        return next.get(indexPermintaan, ++indexIni);
    }

    // TODO change into non-recursive method
    public void remove(int indexPermintaan, int indexNext) {
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
            next.remove(indexPermintaan, ++indexNext);
        }
    }
}