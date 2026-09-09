class Solution {
    public void moveZeroes(int[] nums) {
       int curr=0;
       int pre=0;
       while(curr<nums.length)
       {
            if(nums[curr]==0)
            {
                curr++;
            }
            else
            {
                int temp=nums[pre];
                nums[pre]=nums[curr];
                nums[curr]=temp;
                curr++;
                pre++;
            }
       }
    }
}