package race.condition;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadClass = new ThreadClass(counter);
        Runnable runnableClass = new RunnableClass(counter);
        Thread thread = new Thread(runnableClass);
        threadClass.start();
        thread.start();
    }
}
