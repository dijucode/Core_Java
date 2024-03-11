class MyThreads extends Thread {
    public void run() {
        System.out.println("Hello THere...MyThreads is running..." +
                "In MyThread class which is main class");
    }
}

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThreads thread = new MyThreads();
        thread.start(); // Start the thread

    }
}
