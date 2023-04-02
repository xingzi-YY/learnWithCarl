package 数组.二分查找;

/**
 * @Author: Gokou
 * @Date: 2023/04/01/18:46
 * @Description:
 *      给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 */
public class LM40在排序数组中查找元素的第一个和最后一个位置 {

    public int[] searchRange(int[] nums, int target) {
        int lIndex=binarySearch(nums,target);
        int rIndex=binarySearch(nums,target+1);
        if(lIndex==nums.length||nums[lIndex]!=target)
            return new int[]{-1,-1};
        else
            return new int[]{lIndex,rIndex-1};
    }

    /**
     * 寻找第一个大于等于target的位置
     * @param nums
     * @param target
     * @return
     */
    int binarySearch(int[] nums,int target){
        int l=0,r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }

}
