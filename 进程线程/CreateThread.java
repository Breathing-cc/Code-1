public class CreateThread {
    private static class MyThread extends Thread{
        @Override
        public void run(){
        }
    }

    private static class MyRunnable implements Runnable{
        @Override
        public void run(){
        }
    }

    public static void main(String[] args){
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());
        Thread thread3 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        thread3.start();
        Thread thread4 = new Thread(){
            @Override
            public void run(){
            }
        };
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });
        Thread thread7 = new Thread(() ->{
        });
    }
}
