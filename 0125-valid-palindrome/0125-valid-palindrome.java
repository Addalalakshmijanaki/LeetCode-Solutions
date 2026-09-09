class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))
            {
                if(ch>='A' && ch<='Z')
                {
                    res=res+(char)(ch+32);
                }
                else
                {
                    res=res+ch;
                }
            }
        }
        String rev="";
        for(int i=res.length()-1; i>=0; i--)
        {
            rev=rev+res.charAt(i);
        }
        if(rev.equals(res))
        {
            return true;
        }
        return false;
        
    }
}