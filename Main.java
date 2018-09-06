class Main{
    public static void main(String[] args) {

        MyLinkedList li2 = new MyLinkedList();

        for (int i = 0; i < 5; i++) {
            li2.add(i);
        }
        li2.tampilkan();
        li2.add(4, 999);
        li2.tampilkan();
        // System.out.println("sum: "+li2.sum());
        // System.out.println(li2.contains(2));

        // li2.tampilkan();
        // li2.add(6);
        // li2.tampilkan();
        // li2.removeLast();
        // li2.tampilkan();
        // System.out.println("nah"+li2.get(-1));
        // li2.remove(li2.size()-1);
        // // li2.remove(li2.size());
        // li2.tampilkan();
        // li2.add(8,123);
        // li2.tampilkan();
        // li2.add(8,124);
        // li2.tampilkan();
        // li2.remove(5);
        // li2.tampilkan();
        // System.out.println(li2.index(90));
        // System.out.println(li2.index(-3));

        // --------------------------------

        // System.out.println((A.getRunTime()<B.getRunTime()?"removeLast()()":"popLama()") + " lebih cepat.");
    }
}