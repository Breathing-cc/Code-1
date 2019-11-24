//线程安全版本的懒汉单例
public class SingletonLazyVersion2 {
    private SingletonLazyVersion2(){}

    private  static SingletonLazyVersion2 instance = null;
    public synchronized static SingletonLazyVersion2 getInstance(){
        if(instance == null){
            instance = new SingletonLazyVersion2();
        }
        return instance;
    }
}
