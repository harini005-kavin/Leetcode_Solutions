class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int charrange=256;
        int[] lasts=new int[charrange];
        int[] lastt =new int[charrange];
        for(int i=0;i<s.length();i++)
    {
        int c1=s.charAt(i);
        int c2=t.charAt(i);
        if(lasts[c1]!=lastt[c2])
        {
            return false;
            }
                lasts[c1]=lastt[c2]=i+1;
        
    }       
    return true;
    }
}