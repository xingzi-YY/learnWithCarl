package 数组.移除元素;

/**
 * @Author: Gokou
 * @Date: 2023/04/02/12:34
 * @Description:
 *      给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

 */
public class LE27移除元素 {

    public int removeElement(int[] nums, int val) {
        int l=0,r=nums.length;
        while(l<r){
            if(nums[l]==val){
                nums[l]=nums[r-1];
                r--;
            }else{
                l++;
            }
        }
        return l;
    }

}
