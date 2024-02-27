public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length < 2) return strs[0];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length; j++){
                if(!strs[j].startsWith(result.toString()+strs[0].charAt(i))){
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
}
