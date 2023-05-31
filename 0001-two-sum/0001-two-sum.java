class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = false;
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j <nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    ans.add(i);
                    ans.add(j);
                    flag = true;
                    break;
                }
            }
            if (flag) break; 
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}