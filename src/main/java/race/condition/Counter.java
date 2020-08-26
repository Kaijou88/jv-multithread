package race.condition;

public class Counter {
    private static final int MAX_COUNT = 100;
    private int number = 0;

    public synchronized int getNumber() {
        return number++;
    }

    public synchronized boolean toRun() {
        return MAX_COUNT >= number;
    }
}
