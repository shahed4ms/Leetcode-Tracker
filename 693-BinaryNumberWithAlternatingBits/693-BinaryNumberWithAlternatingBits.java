// Last updated: 11/08/2026, 11:37:22
class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n^(n>>1);
        return (a&(a+1))==0;
    }
}