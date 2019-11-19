import pool.ThreadPoolV1;

public class JconsoleDemo {
    private static Object object = new Object();

    private static class MyThread extends Thread{
        @Override
        public void run(){
            synchronized (object){
                try{
                    Thread.sleep(100000000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args)throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(10);
        synchronized (object){
            System.out.println("成功");
        }
    }
}
