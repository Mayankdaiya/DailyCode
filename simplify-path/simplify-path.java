class Solution {
    public String simplifyPath(String path) {
        List<String> ans=new ArrayList<String>();
        for(String s:path.split("/")){
            if(s.isEmpty() || s.equals(".")){
                continue;
            } else if(s.equals("..")){
                if(!ans.isEmpty()) ans.remove(ans.size()-1);
            } else{
                ans.add(s);
            }
        }
        return '/'+String.join("/",ans);
    }
}