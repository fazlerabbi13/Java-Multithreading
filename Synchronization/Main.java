
class Counter{
    private  int count = 0;
    
    public synchronized void increment(){
        count++;
    }

    public synchronized int get(){
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter cnt = new Counter();


        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 500; i++){
                cnt.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                cnt.increment();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Counter: " + cnt.get());
    }
}
