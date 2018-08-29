class HitungWaktu{
    private long startTime;
    private long runTime;
    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }
    public void endTime() {
        this.runTime = System.currentTimeMillis() - this.startTime;
    }
    public long runTime() {
        return this.runTime;
    }
}