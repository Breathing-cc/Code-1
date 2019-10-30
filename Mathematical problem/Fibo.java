
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
         
        System.out.println(getResult(in.nextInt())); 
    }
 
    public static int getResult(int N)
    {
        int i=0,flag1=0,flag2=0;
        for(;;i++)
        {//寻找输入值N处于哪两个fibo数之间
            flag2=fibo(i);
            if(flag2>N)
                break;
            flag1=flag2;
        }
        return N-flag1>flag2-N?flag2-N:N-flag1;//输出结果
    }
 
    public static int fibo(int number)//递归斐波那契
    {
        if(number==0 || number == 1)
            return number;
        else
            return fibo(number-1)+fibo(number-2);
    }
}