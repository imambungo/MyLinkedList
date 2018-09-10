class Main{
    public static void main(String[] args) {

        Stack a = new Stack();
        for (int i = 0; i < 5; i++) {
            a.push(i);
        }
        a.tampilkan();
        for (int i = 0; i < 3; i++) {
            a.pop();
        }
        a.tampilkan();

        Queue b = new Queue();
        for (int i = 0; i < 5; i++) {
            b.insert(i);
        }
        b.tampilkan();
        for (int i = 0; i < 3; i++) {
            b.remove();
        }
        b.tampilkan();

    }
}