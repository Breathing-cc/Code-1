//synchronized的用法
public class SynchronizdDemo {
    public synchronized void method(){
        for(int i = 0; i < 100000; i ++){
            System.out.println("Method1:" + Thread.currentThread().getName() + ":" + i);

        }
    }

    public synchronized static void staticmethod(){
    }

    public void block(){
        synchronized (this){}
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                object.method();
            }
        }

        private SynchronizdDemo object;

        MyThread(SynchronizdDemo object) {
            this.object = object;
        }
    }

    public static void main(String[] args) {
        SynchronizdDemo object = new SynchronizdDemo();
        Thread t = new MyThread(object);
        t.start();
        while (true){
            object.method();
        }
    }
}
