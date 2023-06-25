class Solution {
    public String capitalizeTitle(String title) {
        List<String> ans=new ArrayList<>();
        for(String s:title.split(" ")){
            if(s.length()<=2){
                ans.add(s.toLowerCase());
            } else{
                s=(""+s.charAt(0)).toUpperCase()+s.substring(1).toLowerCase();
                ans.add(s);
            }
        }
        return String.join(" ",ans);
    }
}