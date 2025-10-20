class ManRunning extends Thread{
    private String task;

    public void MabRunning(String task) {
        this.task=task;
    }

    public void run(){
        System.out.println(task + "is being prepared by " +
         Thread.currentThread().getName());
    }

}


public  class Running{
    public static void main(String[] args) {
        
    }
}