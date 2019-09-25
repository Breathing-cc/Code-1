/*给定两个有序整数数组 nums1 和 nums2，
将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。*/
import java.util.Arrays;
public class Solution5 {
//合并两个有序数组
    public static int[] merge(int[] nums1,int m,int[] nums2,int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3)));
    }
}
