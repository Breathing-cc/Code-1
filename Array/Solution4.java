import java.util.Arrays;

/*给定一个排序数组和一个目标值，
在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。*/
public class Solution4 {
//搜索插入位置
    public static int searchInsert1(int[] nums, int target) {
        for(int i = 0;i <= nums.length -1;i++){
            if (nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
//二分查找
    public static int searchInsert2(int[] nums, int target){
        int begin = 0;
        int end = nums.length - 1;
        if(target > nums[begin]) {
            while (begin <= end) {
                int mid = begin+(end - begin) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = nums.length - 1 - mid -1;
                } else {
                    begin = mid + 1;
                }
            }
        }else {
            return begin;
        }
        return nums.length;
    }
    public static void main(String[] args) {
        System.out.print(searchInsert1(new int[]{1,3,5,6},5));
        System.out.print(searchInsert1(new int[]{5,5,5,5},5));
        System.out.print(searchInsert1(new int[]{1,3,5,6},1));
        System.out.print(searchInsert1(new int[]{1,3,5,6},0));
        System.out.print(searchInsert1(new int[]{1,3,5,6},7));
        System.out.println();
        System.out.print(searchInsert2(new int[]{1,3,5,6},5));
        System.out.print(searchInsert2(new int[]{5,5,5,5},5));
        System.out.print(searchInsert2(new int[]{1,3,5,6},1));
        System.out.print(searchInsert2(new int[]{1,3,5,6},0));
        System.out.print(searchInsert2(new int[]{1,3,5,6},7));
    }
}
