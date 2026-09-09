class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0; i<=31; i++)
        {
            double max=Math.pow(3,i);
            if(n==max)
            {
                return true;
            }
        }
        return false;
    }
}