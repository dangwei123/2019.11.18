数组 A 是 [0, 1, ..., N - 1] 的一种排列，N 是数组 A 的长度。全局倒置指的是 i,j 满足 
0 <= i < j < N 并且 A[i] > A[j] ，局部倒置指的是 i 满足 0 <= i < N 并且 A[i] > A[i+1] 。

当数组 A 中全局倒置的数量等于局部倒置的数量时，返回 true 。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/global-and-local-inversions
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public boolean isIdealPermutation(int[] A) {
        int num1=0;
        int num2=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                num1++;
            }
        }
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[i]){
                    num2++;
                }
            }
        }
        return num1==num2;
        
    }
}



class Solution {
    public boolean isIdealPermutation(int[] A) {
        for(int i=0;i<A.length;i++){
            if(Math.abs(A[i]-i)>1){
                return false;
            }
        }
        return true;
    }
}