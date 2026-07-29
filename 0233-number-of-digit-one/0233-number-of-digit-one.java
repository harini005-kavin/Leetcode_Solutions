class Solution {
    public int countDigitOne(int n) {
        if(n<=0)
        {
            return 0;
        } 
        int q=n;
        int x=1;
        int count=0;
      do  {
        int mod=q%10;
        q=q/10;
        count=count+q*x;
        if(mod==1)
count=count+n%x+1;
if(mod>1)
count=count+x;
x=x*10;
        }
        while(q>0);
        {
            return count;
        }
    }
}