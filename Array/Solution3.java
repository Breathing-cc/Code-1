/*给定一个数组 nums 和一个值 val，
你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
不要使用额外的数组空间，
你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。*/
public class Solution3 {
//移除元素
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val ){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int []nums = new int[]{3,2,2,3};
        int removeNums = removeElement(nums,3);
        for(int k = 0;k < removeNums;k++){
            System.out.print(nums[k]+" ");
        }
    }
}
