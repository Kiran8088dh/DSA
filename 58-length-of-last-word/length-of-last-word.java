class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String str1=str[0];
        String str2=str[str.length-1];
            int count =0;
        for(int i=0;i<str2.length();i++){
            String t="";
            char ch = str2.charAt(i);
            t=t+ch;
            count++;
        }
        return count;
    }
}