
import java.util.concurrent.locks.ReentrantLock;

public class MainLock {
    private static int sharedResource = 0;

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        
    }

    static class IncrementTask implements Readable{
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
