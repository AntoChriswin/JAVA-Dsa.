import java.util.*;
class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }List<List<Integer>> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1,2,3,2,1};
        List<List<Integer>> res = sol.countFrequencies(arr);
        System.out.println(res);
    }
}
