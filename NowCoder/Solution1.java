import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            int sum;
            int j = 0;
            if(n >= 1 && n <= 100) {
                if (n == 1 && n == 2){
                    j = 0;
                }
                while (n >= 3) {
                    j += n / 3;
                    sum = n % 3;
                    n = n / 3 + sum;
                    if(n == 2){
                        j++;
                    }
                }
            }
            System.out.println(j);
        }
    }
}
