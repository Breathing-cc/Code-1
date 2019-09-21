import java.util.Arrays;
public class Practice3 {
    public static int[] rotate(int[] nums, int k) {
        k=k % nums.length;                                           //如果k值超过数组长度，取k模上数组长度的值。
        int[]a=Arrays.copyOfRange(nums,nums.length-k,nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(a, 0, nums, 0, k);
        return nums;
    }
    public static void main(String[]args){
        System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5},3)));
        System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5},8)));
        System.out.println(Arrays.toString(rotate(new int[] {1,2,3,4,5,6,7},8)));
    }
}

