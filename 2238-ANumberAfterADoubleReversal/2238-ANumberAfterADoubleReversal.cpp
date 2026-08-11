// Last updated: 11/08/2026, 11:36:52
class Solution {
public:
    bool isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        return num%10!=0;
        
    }
};