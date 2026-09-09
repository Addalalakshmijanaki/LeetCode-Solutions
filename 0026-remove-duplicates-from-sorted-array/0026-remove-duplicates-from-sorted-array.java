class Solution {
    public int removeDuplicates(int[] nums) {
        int pre=0;
        int curr=1;
        while(curr<nums.length)
        {
            if(nums[curr]==nums[pre])
            {
                curr++;
            }
            else
            {
                nums[pre+1]=nums[curr];
                curr++;
                pre++;
            }
        }
        return pre+1;
    }
}