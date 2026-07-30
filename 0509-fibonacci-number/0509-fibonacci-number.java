class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if (n==2)
        {
            return 1;
        }
        int first =1;int second =1;
        int third=0;
        for(int i=3;i<=n;i++)
        {
             third=first+second;
            
            first=second;
            second=third;
        
      
        }
        return second;
    }
}