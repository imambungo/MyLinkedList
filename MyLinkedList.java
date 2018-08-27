public class MyLinkedList{
    private int index=0;
    private int maxIndex=0;
    private int isiInt;
    private boolean firstAdd = false;
    private boolean firstTampilkan = false;
    MyLinkedList next;
    public MyLinkedList(){}
    public MyLinkedList(int isiInt, int index) {
        this.isiInt = isiInt;
        this.index = ++index;
        this.maxIndex = this.index;
    }
    public boolean diUjung() {
        if (index == maxIndex) {
            return true;
        }
        return false;
    }
    public void add(int ygDitambah) {
        if (this.maxIndex == 0 && this.firstAdd == false) {
            this.isiInt = ygDitambah;
            this.firstAdd = true;
        }else{
            if (diUjung()) {
                next = new MyLinkedList(ygDitambah, this.index);
            } else {
                next.add(ygDitambah);
            }
            this.maxIndex++;
        }
    }
    public void tampilkan() {
        if (this.maxIndex == 0 && this.firstTampilkan == false) {
            System.out.print("["+this.isiInt+",");
            this.firstTampilkan = true;
        } else {
            if (diUjung()) {
                System.out.println(this.isiInt+"]");
            } else {
                System.out.print(this.isiInt+",");
                next.tampilkan();
            }
        }
    }
}