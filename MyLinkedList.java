public class MyLinkedList{// Berperan sebagai Head
    private Node next;
    
    public void collapse() {
        this.next = null;
    }

    // TODO make shortcut to jump to the last node
    public boolean add(int ygDitambah) {
        if (this.next == null) {
            next = new Node(ygDitambah);
        } else {
            Node pointer = next;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new Node(ygDitambah);
        }
        return true;
    }

    // TODO change to non-recursive method
    public void add(int indexPermintaan, int ygDitambah) {
        if (this.next == null || indexPermintaan < 0) {
            System.out.println("Error: Index out of bound gan :v");
            if (this.next == null)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> LinkedList is empty");
            if (indexPermintaan < 0)
                System.out.println("\t.hapus(" + indexPermintaan + ") -> Minimum index is 0");
            System.exit(0);
        } else if (indexPermintaan == 0) {
            Node sisip = new Node(ygDitambah);
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
            System.out.println(","+pointer.getIsiInt());
            pointer = pointer.next;
        }
        System.out.println("]");
    }

    // TODO change to non-recursive method
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

    // TODO change to non-recursive method
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

    // TODO change to non-recursive method
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
    protected Node next;

    public Node(int isiInt) {
        this.isiInt = isiInt;
    }

    public int getIsiInt() {
        return this.isiInt;
    }

    // TODO change to non-recursive method
    public void add(int indexPermintaan, int ygDitambah, int indexNext) {
        if (next.next == null && indexPermintaan > indexNext) {
            System.out.println("Error: Index out of bound gan :v");
            System.out.println("\t.hapus(" + indexPermintaan + ") -> last index: " + indexNext);
            System.exit(0);
        } else if (indexPermintaan == indexNext) {
            Node sisip = new Node(ygDitambah);
            sisip.next = this.next;
            this.next = sisip;
        } else {
            next.add(indexPermintaan, ygDitambah, ++indexNext);
        }
    }

    // TODO change to non-recursive method
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

    // TODO change to non-recursive method
    public int size() {
        if (next == null) {
            return 1;
        }
        return 1 + next.size();
    }

    // TODO change to non-recursive method
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