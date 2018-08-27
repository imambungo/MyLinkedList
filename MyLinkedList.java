class MyLinkedList{
    private int index=0;
    private int maxIndex=0;
    private int isiInt;
    private boolean first = false;
    MyLinkedList next;
    public MyLinkedList(int isiInt, int index) {
        this.isiInt = isiInt;
        this.index = ++index;
        this.maxIndex = this.index;
    }
    public boolean diUjung(){
        if (index == maxIndex) {
            return true;
        }
        return false;
    }
    public void add(int ygDitambah) {
        if (this.maxIndex == 0 && this.first == false) {
            this.isiInt = ygDitambah;
            this.first = true;
        }else{
            this.maxIndex++;
            if (diUjung()) {
                next = new MyLinkedList(ygDitambah, this.index);
            } else {
                next.add(ygDitambah);
            }
        }
    }
}