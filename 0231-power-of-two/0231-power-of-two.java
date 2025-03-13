class Solution {
    public boolean isPowerOfTwo(int n) {
       return (n>0 && (n & n-1)==0)?true:false;
    }
}
// 32 16 8 4 2 1
//  1  0 0 0 0 0
//  0  1 1 1 1 1