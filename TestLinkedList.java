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
        a.tampilkan();
        a.pop();
        a.tampilkan();
        a.hapus(5);
        a.tampilkan();
        a.hapus(a.size()-1);
        // a.hapus(a.size());
        a.tampilkan();
        a.add(8,123);
        a.tampilkan();
        a.add(8,124);
        a.tampilkan();
        // System.out.println(a.index(90));
        // System.out.println(a.index(-3));
        System.out.println(a.index(a.size()-1));
    }
}