package race.condition;

import org.apache.log4j.Logger;

public class Counter {
    private static final Logger LOGGER = Logger.getLogger(Counter.class);
    private static final int MAX_COUNT = 100;
    private int number = 0;
    private FirstThread firstThread;
    private SecondThread secondThread;

    public Counter() {
        firstThread = new FirstThread() {
            public void run() {
                while (toRun()) {
                    int val = getNumber();
                    LOGGER.info(Thread.currentThread().getName() + " value = " + val);
                }
            }
        };
        secondThread = new SecondThread() {
            public void run() {
                while (toRun()) {
                    int val = getNumber();
                    LOGGER.info(Thread.currentThread().getName() + " value = " + val);
                }
            }
        };
        Thread thirdThread = new Thread(secondThread);
        firstThread.start();
        thirdThread.start();
    }

    public synchronized int getNumber() {
        return number++;
    }

    public synchronized boolean toRun() {
        return MAX_COUNT >= number;
    }
}
