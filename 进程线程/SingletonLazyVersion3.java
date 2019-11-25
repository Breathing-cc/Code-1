public class SingletonLazyVersion3 {
    private SingletonLazyVersion3(){}
    private static  volatile SingletonLazyVersion3 instance = null;

    private static SingletonLazyVersion3 getInstance(){
        if(instance == null){
            synchronized (SingletonLazyVersion3.class){
                if(instance == null){
                    instance = new SingletonLazyVersion3();
                }
            }
        }
        return instance;
    }
}