import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class MyTimer {
    private static BlockingQueue<String>queue = new ArrayBlockingQueue<>(1);
            //new PriorityBlockingQueue<>();
            //new ArrayBlockingQueue<>(10);
            //new LinkedBlockingDeque<>();

    private static class Prducer extends Thread{
        @Override
        public void run(){
            Random random = new Random(20191116);
            while(true){
                try{
                    int message = random.nextInt(100);
                    queue.put(String.valueOf(message));
                    System.out.println("放入消息："+message);
                    Thread.sleep(random.nextInt(3) * 100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Customer extends Thread{
        @Override
        public void run(){
            Random random = new Random(20191116);
            while(true){
                try{
                    String message = queue.take();
                    System.out.println("收到消息："+message);
                    Thread.sleep(random.nextInt(3) * 100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producer = new Prducer();
        Thread customer = new Customer();
        producer.start();
        customer.start();
    }
}
