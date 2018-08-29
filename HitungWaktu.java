class HitungWaktu{
    private long startTime;
    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }
    public void endTime() {
        System.out.println("Runtime: " + (System.currentTimeMillis() - this.startTime));
    }
}