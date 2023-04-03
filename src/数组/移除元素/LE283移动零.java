package 数组.移除元素;

/**
 * @Author: Gokou
 * @Date: 2023/04/03/22:08
 * @Description:
 *      给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class LE283移动零 {

    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0,j=0;j<n;j++) {
            if (nums[j] != 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
        }
    }

}
