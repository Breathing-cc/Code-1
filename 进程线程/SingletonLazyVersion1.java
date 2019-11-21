public class SingletonLazyVersion1 {
    private SingletonLazyVersion1(){
    }

    private static SingletonLazyVersion1 instance = null;
    //getInstance被第一次调用时，意味着有人需要instance
    //再进行初始化
    public static SingletonLazyVersion1 getInstance(){
        if(instance == null){
            instance = new SingletonLazyVersion1();
        }
        return instance;
    }
}
