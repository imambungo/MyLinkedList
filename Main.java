class Main{
    public static void main(String[] args) {

        MyLinkedList li2 = new MyLinkedList();

        for (int i = 0; i < 100000; i++) {
            li2.add(i);
        }
        li2.add(100000, 999);
        for (int i = 0; i < 100000; i++) {
            li2.removeLast();
        }
        li2.tampilkan();

        // a.tampilkan();
        // a.add(6);
        // a.tampilkan();
        // a.popBaru();
        // a.tampilkan();
        // a.hapus(5);
        // a.tampilkan();
        // a.hapus(a.size()-1);
        // // a.hapus(a.size());
        // a.tampilkan();
        // a.add(8,123);
        // a.tampilkan();
        // a.add(8,124);
        // a.tampilkan();
        // // System.out.println(a.index(90));
        // // System.out.println(a.index(-3));
        // System.out.println(a.index(a.size()-1));

        // --------------------------------

        // System.out.println((A.getRunTime()<B.getRunTime()?"popBaru()":"popLama()") + " lebih cepat.");
    }
}