package 数组.移除元素;

/**
 * @Author: Gokou
 * @Date: 2023/04/05/21:20
 * @Description:
 *
 *      给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class LE977有序数组的平方 {

    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,p=n-1;
        int[] res =new int[n];
        while(p>=0){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
                res[p--]=nums[i]*nums[i];
                i++;
            }
            else{
                res[p--]=nums[j]*nums[j];
                j--;
            }
        }
        return res;
    }

}
