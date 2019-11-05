public class JoinDemo {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }


    public static void main(String[] args)throws InterruptedException {
        Thread t1 = new Thread();
        t1.start();
        t1.join();
    }
}
