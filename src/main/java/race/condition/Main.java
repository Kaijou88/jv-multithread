package race.condition;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        FirstThread firstThread = new FirstThread(counter);
        SecondThread secondThread = new SecondThread(counter);
        Thread thirdThread = new Thread(secondThread);
        firstThread.start();
        thirdThread.start();
    }
}
