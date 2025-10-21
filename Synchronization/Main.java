
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
    }
}
