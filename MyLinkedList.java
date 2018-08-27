class MyLinkedList{
    private int index=0;
    private int maxIndex;
    private int isiInt;
    MyLinkedList next;
    public MyLinkedList(int isiInt, int index) {
        this.isiInt = isiInt;
        this.index = ++index;
    }
    public boolean diUjung(){
        if (index == maxIndex) {
            return true;
        }
        return false;
    }
    public void add(int ygDitambah) {
        if (diUjung()) {
            next = new MyLinkedList(ygDitambah, this.index);
        }else{
            next.add(ygDitambah);
        }
    }
}