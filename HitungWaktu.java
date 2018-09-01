public class HitungWaktu{
    private static long startTime;
    private static long endTime;
    private static long runTime;
    public static void startTime() {
        startTime = System.nanoTime();
        // System.out.println("startTime : "+startTime);
    }
    public static void endTime() {
        endTime = System.nanoTime();
        runTime = endTime - startTime;
        // System.out.println("endTime   : " + endTime);
    }
    public static void runTime() {
        System.out.println("runTime   : " + runTime);
    }
    public static long getRunTime() {
        return runTime;
    }

    public static void startTimeM() {
        startTime = System.currentTimeMillis();
        // System.out.println("startTime : "+startTime);
    }
    public static void endTimeM() {
        endTime = System.currentTimeMillis();
        runTime = endTime - startTime;
        // System.out.println("endTime   : " + endTime);
    }
    public static void runTimeM() {
        System.out.println("runTime   : " + runTime);
    }
}