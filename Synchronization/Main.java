
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
    
}
