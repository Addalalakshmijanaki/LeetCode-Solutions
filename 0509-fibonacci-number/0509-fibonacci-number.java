class Solution {
    public int fib(int n) {
        if(n==1)
        {
            return 1;
        }
       int f=0;
       int s=1;
       int t=0;
       for(int i=2; i<=n; i++)
       {
           t=f+s;
           f=s;
           s=t;
       }
       return t;
    }
}