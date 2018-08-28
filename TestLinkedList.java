class TestLinkedList{
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        a.tampilkan();
        a.add(100);
        a.tampilkan();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        a.tampilkan();
        a.add(6);
        a.add(5);
        a.add(4);
        a.tampilkan();
        // System.out.println(a.index(0));
        // System.out.println(a.index(3));
        // System.out.println(a.index(a.length()));
    }
}