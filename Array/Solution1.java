/*给定一个整数数组 nums 和一个目标值 target，
  请你在该数组中找出和为目标值的那两个整数，
  并返回他们的数组下标。
  你不能重复利用这个数组中同样的元素。*/
import java.util.Arrays;
public class Solution1 {
//两数之和
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    System.out.println(nums[i] + " " + nums[j]);
                    return new int[]{i, j};
                }
            }
        }
        return  nums;
    }
    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15},9);
    }
}
