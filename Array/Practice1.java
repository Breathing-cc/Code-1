import java.util.Arrays;
public class Practice1{
    //冒泡
        public static void swap(int[]a,int i,int j){
            int num = a[i];
            a[i] = a[j];
            a[j] = num;
        }
        public static void Bubble(int[]a){
            for(int i = 0;i < a.length -1;i++){             //外层循环控制趟数，总趟数为len-1
                for(int j = 0; j < a.length-1-i;j++){       //内层循环为当前i趟数 所需要比较的次数
                    if (a[j] > a[j+1]){
                        swap(a,j,j+1);
                    }
                }
            }
        }
        public static void testBubblesort(int[]a){
            System.out.println("排序前：");
            System.out.println(Arrays.toString(a));
            Bubble(a);
            System.out.println("排序后：");
            System.out.println(Arrays.toString(a));
        }
        public static void main(String[] args) {
            int[]a = {1,2,3,4,5,6,7};
            int[]b = {2,3,5,4,6,7,1};
            int[]c = {3,3,3,3,3,3,3};
            System.out.println("冒泡");
            testBubblesort(a);
            testBubblesort(b);
            testBubblesort(c);
        }
}
