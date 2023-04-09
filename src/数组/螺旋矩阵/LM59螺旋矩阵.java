package 数组.螺旋矩阵;

/**
 * @Author: Gokou
 * @Date: 2023/04/09/21:43
 * @Description:
 *      给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 *
 */
public class LM59螺旋矩阵 {

    public int[][] generateMatrix(int n) {
        int circle=n/2+n%2;
        int num=1,i=0,j=0;
        int[][] res=new int[n][n];
        for(i=0;i<circle;i++){
            for(j=i;j<n-i-1;j++)
                res[i][j]=num++;
            for(j=i;j<n-i-1;j++)
                res[j][n-i-1]=num++;
            for(j=n-i-1;j>i;j--)
                res[n-i-1][j]=num++;
            for(j=n-i-1;j>i;j--)
                res[j][i]=num++;
        }
        if(n%2==1){
            int mid=n/2+1;
            res[mid-1][mid-1]=num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints = new LM59螺旋矩阵().generateMatrix(3);
    }
}
