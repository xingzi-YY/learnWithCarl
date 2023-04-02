package 数组.二分查找;

/**
 * @Author: Gokou
 * @Date: 2023/04/02/11:34
 * @Description:
 *      给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。

 */
public class LE69x的平方根 {

    public int mySqrt(int x) {
        if(x<=1) return x;
        int l=1,r=x/2;
        while(l<r){
            int mid=l+(r-l)/2+1;
            if((long)mid*mid>x)
                r=mid-1;
            else
                l=mid;
        }
        return l;
    }

}
