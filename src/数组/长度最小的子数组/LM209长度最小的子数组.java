package 数组.长度最小的子数组;

/**
 * @Author: Gokou
 * @Date: 2023/04/05/21:50
 * @Description:
 *      给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
public class LM209长度最小的子数组 {

    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0,minLen=Integer.MAX_VALUE;
        for(int i=0,j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=target){
                minLen=Math.min(minLen,j-i+1);
                sum-=nums[i++];
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }

}
