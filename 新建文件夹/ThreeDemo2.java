import java.util.Scanner;

class Fbonacci{
    public static long calc(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return calc(n - 1) + calc(n - 2);
        }
    }
}
class FbonacciThread extends Thread{
    private int n;
    FbonacciThread(int n){
        this.n = n;
    }

    @Override
    public void run(){
        long result = Fbonacci.calc(n);
        System.out.printf("第 %d 项斐波那契数为： %d%n",n,result);
    }
}

public class ThreeDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入要计算第几项的斐波那契数");
            int n = scanner.nextInt();
            Thread thread = new FbonacciThread(n);
            thread.start();
        }
    }
}
