package 数组.二分查找;

/**
 * @Author: Gokou
 * @Date: 2023/04/02/11:44
 * @Description:
 *      给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
 *
 * 不能使用任何内置的库函数，如  sqrt 。
 *
 */
public class LE367有效的完全平方数 {

    public boolean isPerfectSquare(int num) {
        if(num<=1) return true;
        int l=1,r=num/2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if((long)mid*mid>num)
                r=mid-1;
            else if((long)mid*mid<num)
                l=mid+1;
            else
                return true;
        }
        return false;
    }

}
