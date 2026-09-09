class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int sum1=0;
        int right=nums.length-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            sum1=Math.max(sum,sum1);
            left++;
            right--;
        }
        return sum1;
    }
}