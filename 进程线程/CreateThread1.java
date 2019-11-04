public class CreateThread1 {
    private static class MyThread extends Thread{
        private int n = 0;

        @Override
        public void run(){
            while(n < 10){
                System.out.println(n);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                n++;
            }
        }
    }

    private static class ShareResource{
        public int n = 0;
    }

    private static class MyThread2 extends Thread{
        private ShareResource resource;

        MyThread2(ShareResource resource){
            this.resource = resource;
        }

        @Override
        public void run(){
            while (resource.n < 10){
                System.out.println(resource.n);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                resource.n++;
            }
        }
    }

    public static void main(String[] args) {
        ShareResource resource = new ShareResource();
        Thread thread1 = new MyThread2(resource);
        Thread thread2 = new MyThread2(resource);
        thread1.start();
        thread2.start();
    }
}
