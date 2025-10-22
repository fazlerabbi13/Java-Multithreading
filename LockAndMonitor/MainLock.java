package LockAndMonitor;

import java.util.concurrent.locks.ReentrantLock;

public class MainLock {
    private static int sharedResource = 0;

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
         Thread t1 = new Thread(new IncrementTask());
         Thread t2 = new Thread(new IncrementTask());

         t1.start();
         t2.start();

         try{
            t1.join();
            t2.join();
         }catch(InterruptedException e){
            System.out.println("Thread inturrupted");
         }

         System.out.println("Final value of sharedResources: " + sharedResource);
    }

    static class IncrementTask implements Runnable{
        public void run(){
            for(int i = 0; i < 1000; i++){
                lock.lock();

                try {
                    sharedResource++;
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
