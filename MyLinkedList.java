public class MyLinkedList{
    private int index=0;
    private int maxIndex=0;
    private int isiInt;
    private boolean firstAdd = false;
    MyLinkedList next;
    public MyLinkedList(){}
    public MyLinkedList(int isiInt, int index) {
        this.isiInt = isiInt;
        this.index = ++index;
        this.maxIndex = this.index;
    }
    public boolean diUjung() {
        if (this.next == null) {
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
        if (this.index == 0) {
            System.out.print("["+this.isiInt+",");
            next.tampilkan();
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