package CreateThreads;

class MainTask implements Runnable{
    private String  task;

    MainTask(String task) {
        this.task = task;
    }

    public void run(){
        System.out.println(task + "is being prepared " 
        + Thread.currentThread().getName());
    }

    
}

public class ManageTask {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MainTask("java"));
        Thread t2 = new Thread(new MainTask("python"));
        Thread t3 = new Thread(new MainTask("c++"));


        // t1.start();
        // t2.start();
        // t3.start();
    }
}
