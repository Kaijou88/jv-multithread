package race.condition;

import org.apache.log4j.Logger;

public class RunnableClass implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(Counter.class);
    private Counter value;

    public SecondThread(Counter value) {
        this.value = value;
    }

    public void run() {
        while (value.toRun()) {
            int val = value.getNumber();
            LOGGER.info(Thread.currentThread().getName() + " value = " + val);
        }
    }
}
