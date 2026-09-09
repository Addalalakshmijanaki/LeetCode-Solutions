class Solution {
    public int addDigits(int num) {
        int sum=0;
        int rev=0;
        if(num==0)
            return 0;
        while(num>0)
        {
                int digit=num%10;
                rev=rev+digit;
                num=num/10; 
        }
        while(rev>=10)
        {
            rev=(rev%10)+(rev/10);
        }
        return rev;
    }
}