// Last updated: 11/08/2026, 11:37:54
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int j=0;
        int max=Math.max(Arrays.stream(nums2).max().getAsInt(),Arrays.stream(nums1).max().getAsInt());
        int[] freq=new int[max+1];
        int[] res=new int[nums1.length+1];
        for(int i=0;i<nums2.length;i++){
            freq[nums2[i]]++;
        }
        for(int i=0;i<nums1.length;i++){
            if(freq[nums1[i]]>0){
                res[j++]=nums1[i];
                freq[nums1[i]]--;
            }
        }return  Arrays.copyOf(res, j);

    }
}