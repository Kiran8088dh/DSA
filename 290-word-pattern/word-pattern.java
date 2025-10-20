class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(arr.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            boolean containsKey=map.containsKey(ch);
            if(map.containsValue(arr[i])&& !containsKey){
                return false;
            }else if(containsKey && !map.get(ch).equals(arr[i])){
                return false;
            }else{
                map.put(ch,arr[i]);
            }
            
        }
        return true;
    }
}