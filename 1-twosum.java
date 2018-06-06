class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(int i = 0; i <= nums.length-2; i++){
            for(int j = i+1; j <= nums.length-1; j++){
                if((nums[i]+nums[j]) == target){
                    a[0] = i;
                    a[1] = j;
                    // System.out.println(i);
                }
            }
        }
        return a;
    }
}

