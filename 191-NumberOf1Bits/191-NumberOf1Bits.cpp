// Last updated: 11/08/2026, 11:38:28
class Solution {
public:
    int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
        
    }
};