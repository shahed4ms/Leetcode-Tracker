// Last updated: 11/08/2026, 11:40:19
class Solution {  
    private void fun(int[] candidates, int remaining, int ptr, List<Integer> curr, List<List<Integer>> res) {
        if (remaining == 0) {
            res.add(new ArrayList<>(curr)); // Capture explicit snapshot copy
            return;
        }
        for (int poss = ptr; poss < candidates.length; poss++) {
        
            if (candidates[poss] > remaining) break; 
            
            curr.add(candidates[poss]);
            
            fun(candidates, remaining - candidates[poss], poss, curr, res);
            
            curr.remove(curr.size() - 1); // Backtrack state
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); // Prerequisite for the break condition optimization
        List<List<Integer>> res = new ArrayList<>();
        fun(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
}