class Main{
    public static void main(String[] args) {

        HitungWaktu List = new HitungWaktu("List assignment");
        HitungWaktu Arr = new HitungWaktu("Array assignment");
        HitungWaktu List2 = new HitungWaktu("List print");
        HitungWaktu Arr2 = new HitungWaktu("Array print");
        int banyakIndex = 100000;

        MyLinkedList li = new MyLinkedList();
        List.startTimeM();
        for (int i = 0; i < banyakIndex; i++) {
            li.add(i);
        }
        List.endTimeM();
        List2.startTime();
        li.tampilkan();
        List2.endTime();

        int[] arr = new int[banyakIndex];
        Arr.startTimeM();
        for (int i = 0; i < banyakIndex; i++) {
            arr[i] = i;
        }
        Arr.endTimeM();
        Arr2.startTime();
        for (int i = 0; i < banyakIndex; i++) {
            System.out.println(arr[i]);
        }
        Arr2.endTime();
        Arr.runTimeM();
        Arr2.runTimeM();
        List.runTimeM();
        List2.runTimeM();


        // MyLinkedList b = new MyLinkedList();
        // a.tampilkan();
        // a.add(100);
        // a.tampilkan();

        // HitungWaktu.startTime();
        // for (int i = 0; i < 5; i++) {
        //     a.add(i);
        // }
        // HitungWaktu.endTime();
        // HitungWaktu.runTime();
        // a.tampilkan();
        
        // HitungWaktu.startTime();
        // for (int i = 0; i < 5; i++) {
        //     a.add2(i);
        // }
        // HitungWaktu.endTime();
        // a.tampilkan();
        // HitungWaktu.runTime();

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