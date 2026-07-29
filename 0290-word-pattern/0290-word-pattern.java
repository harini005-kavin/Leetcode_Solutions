class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
        {
            return false;
        }  
        HashMap<Character,String> ch=new HashMap<>();
        HashSet<String> m =new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String w=words[i];
        
       if(ch.containsKey(c))
       {
        if(!ch.get(c).equals(w))
        {
            return false;
        }
       }
        else
        {
            if(m.contains(w))
            {
                return false;}
                ch.put(c,w);
                m.add(w);
            }
        }
        return true;
       }
        
      
}