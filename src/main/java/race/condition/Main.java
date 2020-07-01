package race.condition;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadClass threadClass = new ThreadClass(counter);
        RunnableClass runnableClass = new RunnableClass(counter);
        Thread thread = new Thread(runnableClass);
        threadClass.start();
        thread.start();
    }
}
