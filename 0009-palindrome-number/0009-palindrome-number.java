class Solution {
    public boolean isPalindrome(int x) {
    int dig=0;
    int temp=x;
       while(x>0)
       {
        int r=x%10;
        dig=(dig*10)+r;
        x=x/10;
     
       } 
       if(x<0)
       {
        return false;
       }
       if(dig == temp )
       return true;
    else
    {
        return false;
    }
    }
}