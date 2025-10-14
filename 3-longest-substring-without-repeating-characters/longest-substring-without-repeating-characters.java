class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> li=new ArrayList<Character>();
        while(end<s.length()){
            if(!li.contains(s.charAt(end))){
                li.add(s.charAt(end));
                end++;
                max_length=Math.max(max_length,li.size());
            }
            else{
                li.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}