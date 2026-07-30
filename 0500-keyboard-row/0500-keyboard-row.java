import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
       String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
       ArrayList<String> ans=new ArrayList<>();
        for(String arg1:words)
        {
           int c1=0;
           int c2=0; 
           int c3=0;
           String s=arg1.toLowerCase();
        for(char c:s.toCharArray())
        {
           if(row1.indexOf(c)!=-1)
           {
            c1++;
           }
           else if(row2.indexOf(c)!=-1)
           {
            c2++;
           }
           else
           {
            c3++;
           }
        }
        if(c1==s.length()||c2==s.length()||c3==s.length()){
ans.add(arg1);
        }
        }
        
       return ans.toArray(new String[0]);  
    }
}