class Solution {
    public int reverseBits(int n) {
        String d=Integer.toBinaryString(n);
       String ag=String.format("%32s",d).replace(' ','0');
       String rev=new StringBuilder(ag).reverse().toString();
       return (int) Long.parseLong(rev, 2);
    }
}