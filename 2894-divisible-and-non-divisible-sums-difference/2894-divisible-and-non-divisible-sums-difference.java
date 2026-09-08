class Solution {
    public int differenceOfSums(int n, int m) {
        int i=1;
        int sum=0;
        int sum2=0;
        while(i<=n)
        {
            if(i%m!=0)
            {
                sum=sum+i;
            }
            else
            {
                sum2=sum2+i;
            }
            i++;
        }
        return sum-sum2;
    }
}