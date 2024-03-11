import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int id) {
        this.taskId = id;
    }

    public void run() {
        System.out.println("Task " + taskId + " is executing...");
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(200);

        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executor.execute(task);
        }

        executor.shutdown(); // Shutdown the executor when tasks are completed
    }
}
