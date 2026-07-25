class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
        if(nums.length==0)
       {
        return 0;
       }
       
       int max1=1;
         int count=1;
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]==nums[i+1])
        {
            continue;
        }
      
           if(nums[i]+1==nums[i+1])
           {
            count++;
           }
           max1=Math.max(max1,count);
          if(nums[i]+1!=nums[i+1])
           {
            count=1;
           }
        
            

          // max=Math.max(count,max);
           }
       
       return max1;
    }
}