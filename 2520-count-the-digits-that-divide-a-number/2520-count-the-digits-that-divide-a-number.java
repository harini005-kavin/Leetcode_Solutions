class Solution {
    public int countDigits(int num) {
        int sum=0;
        int count =0;
        int x=num;
        while(num!=0)
        {
            int mod=num%10;
          
            if(x%mod==0)
            count++;
             num=num/10;
        }
        return count;
    }
}