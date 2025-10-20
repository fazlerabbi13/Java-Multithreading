package CreateThreads;

class ManRunning extends Thread{
    private String task;

    public ManRunning(String task) {
       this.task=task;
    }

    public void run(){
        System.out.println(task + "is being prepared by " +
         Thread.currentThread().getName());
    }

}


public  class Running{
    public static void main(String[] args) {
        Thread t1 = new ManRunning("high run");
        Thread t2 = new ManRunning("low run");
        Thread t3 = new ManRunning("medium run");
        Thread t4 = new ManRunning("very low");
    

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    
    
    
    }
}