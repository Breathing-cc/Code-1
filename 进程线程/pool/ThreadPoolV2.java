package pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPoolV2 {
    private BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(10);
    private int maxThreads = 5;
    private int currentThreads = 0;
    private Thread[]works = new Thread[maxThreads];

    public void execute(Runnable cmd) throws InterruptedException {
        if (currentThreads == maxThreads) {
            workQueue.put(cmd);
        } else {
            Worker worker = new Worker(workQueue);
            works[currentThreads++] = worker;
            worker.start();
            workQueue.put(cmd);
        }
    }

    private static class Worker extends Thread{
        private  BlockingQueue<Runnable>workQueue;
        Worker(BlockingQueue<Runnable>queue){
            workQueue = queue;
        }
        @Override
        public void run(){
            while (!isInterrupted()){
                try {
                    Runnable cmd = workQueue.take();
                    cmd.run();
                }catch (InterruptedException e){
                    break;
                }
            }
        }
    }
}