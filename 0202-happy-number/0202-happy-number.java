class Solution {
    public boolean isHappy(int n) {
        int sum=0;
      
        while(n!=1 && n!=4)
        {
            int k=0;
            while(n>0)
            {
                int digit=n%10;
                sum=digit*digit;
                n=n/10;
                k=k+sum;
            }
            n=k;

        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
}