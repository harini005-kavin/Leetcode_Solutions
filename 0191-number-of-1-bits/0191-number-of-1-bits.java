class Solution {
    public int hammingWeight(int n) {
           String d=Integer.toBinaryString(n);
           int sum=0;
           for(int i=0;i<d.length();i++)
           {
            sum=sum+d.charAt(i)-'0';
           }
        return sum;
    }
}