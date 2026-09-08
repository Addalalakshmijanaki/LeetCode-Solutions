class Solution {
    public int tribonacci(int n) {
       if(n<2)
       {
        return n;
       }

       else if(n==2)
       {
        return 1;
       }
       int f=0;
       int s=1,t=1;
       int fo=f+s+t;
       
       for(int i=3; i<=n; i++)
       {
           fo=f+s+t;
           f=s;
           s=t;
           t=fo;
       }
       return fo;
    }
}