import java.util.Arrays;
public class Practice2 {
//偶在前奇在后
    public static void swap(int []a,int i ,int j){
        int num = a[i];
        a[i] = a[j];
        a[j] = num;
    }
    public static int[] oddeven1(int []a) {
        int d=0;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] % 2 == 0) {
                swap(a,i,d);
                d++;
            }
        }
        return a;
    }
    public static int[] oddeven2(int []a){
        int begin = 0;
        int end = a.length-1;
        while(begin < end){
            while(begin < end && a[begin]%2 == 0){
                begin++;
            }
            while (begin < end && a[end]%2 !=0){
                end--;
            }
            swap(a,begin,end);
        }
        return a;
    }
    public static void main(String [] args){
        System.out.println("偶在前奇在后:");
        System.out.println(Arrays.toString(oddeven1(new int [] {1,2,3,4,5,6,7,8})));
        System.out.println(Arrays.toString(oddeven2(new int [] {1,2,3,4,5,6,7,8})));
    }
}
