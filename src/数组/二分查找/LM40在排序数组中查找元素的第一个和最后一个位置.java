package 数组.二分查找;

/**
 * @Author: Gokou
 * @Date: 2023/04/01/18:46
 * @Description:
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
