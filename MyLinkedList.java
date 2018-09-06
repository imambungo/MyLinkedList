public class MyLinkedList{// Berperan sebagai Head
    private Node next;
    private Node tail;
    private int size;
    private int sum = 0;
    
    public void clear() {
        this.next = null;
        this.size = 0;
    }

    public int sum() {
        return this.sum;
    }

    public int getFirst() {
        return this.next.getIsiInt();
    }

    public int getLast() {
        return this.tail.getIsiInt();
    }

    public boolean contains(int nilai) {
        Node pointer = this.next;
        while (pointer != null) {
            if (pointer.getIsiInt() == nilai) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
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
        this.sum += ygDitambah;
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
        this.sum += ygDitambah;
    }

    public Node removeFirst() {
        Node temp = next;
        if (this.next != null) {
            next = next.next;
            this.sum -= temp.next.getIsiInt();
            temp.next = null;// apakah harus pakai ini?
            this.size--;
        }
        return temp;
    }

    public void add(int index, int nilai) {
        if (index < 0 || index > size()) {
            System.out.println("Error: Index out of bound gan :v");
            if (index > size())
                System.out.println("\tvoid add(" + index + "," + nilai + ") -> Maximum index is " + (size()-1));
            if (index < 0)
                System.out.println("\tvoid add(" + index + "," + nilai + ") -> Minimum index is 0");
            System.exit(0);
        } else if (index == 0) {
            addFirst(nilai);
        } else {
            Node nodeBaru;
            Node pointer = next;
            int i = index;
            while (i > 0) {
                pointer = pointer.next;
                i--;
            }
            nodeBaru = new Node(nilai,pointer.previous);
            pointer.previous.next = nodeBaru;
            pointer.previous = nodeBaru;
            nodeBaru.next = pointer;
        }
        // if (index == size()) {
        //     this.tail = 
        // }
        this.size++;
        this.sum += nilai;
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

    public int get(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Error: Index out of bound gan :v");
            if (index >= size())
                System.out.println("\tint get(" + index + ") -> Maximum index is " + (size()-1));
            if (index < 0)
                System.out.println("\tint get(" + index + ") -> Minimum index is 0");
            System.exit(0);
        } else {
            Node pointer = next;
            while (index > 0) {
                pointer = pointer.next;
                index--;
            }
            return pointer.getIsiInt();
        }
        return -1;
    }

    public int size() {
        return this.size;
    }

    public Node removeLast() {
        Node temp = null;
        if (next != null){
            if (next.next == null) {
                temp = next;
                this.sum -= next.getIsiInt();
                next = null;
            } else {
                temp = tail;
                this.sum -= temp.getIsiInt();
                tail.previous.next = null;
                tail = tail.previous;
            }
            this.size--;
        }
        return temp;
    }

    // TODO change hapus(int) into non-recursive method
    public void remove(int indexPermintaan) {
        if (this.next == null || indexPermintaan < 0) {
            System.out.println("Error: Index out of bound gan :v");
            if (this.next == null)
                System.out.println("\tvoid remove(" + indexPermintaan + ") -> LinkedList is empty");
            if (indexPermintaan < 0)
                System.out.println("\tvoid remove(" + indexPermintaan + ") -> Minimum index is 0");
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