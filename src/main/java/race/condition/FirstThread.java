package race.condition;

import org.apache.log4j.Logger;

public class ThreadClass extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Counter.class);
    private Counter value;

    public FirstThread(Counter value) {
        this.value = value;
    }

    @Override
    public void run() {
        Counter counter = new Counter();
        while (value.toRun()) {
            int val = value.getNumber();
            LOGGER.info(Thread.currentThread().getName() + " value = " + val);
        }
    }
}
