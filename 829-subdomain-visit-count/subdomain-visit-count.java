class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String str1[]=cpdomains[i].split(" ");
            String str2[]=str1[1].split("\\.");
            int rep=Integer.parseInt(str1[0]);
            int n=str2.length;
            if(n==1){
                map.put(str2[0],map.getOrDefault(str2[0],0)+rep);
            } else if(n==2){
                map.put(str2[1],map.getOrDefault(str2[1],0)+rep);
                map.put((str2[0]+"."+str2[1]),map.getOrDefault((str2[0]+"."+str2[1]),0)+rep);
            } else{
                map.put(str2[2],map.getOrDefault(str2[2],0)+rep);
                map.put((str2[1]+"."+str2[2]),map.getOrDefault((str2[1]+"."+str2[2]),0)+rep);
                map.put((str2[0]+"."+str2[1]+"."+str2[2]),map.getOrDefault((str2[0]+"."+str2[1]+"."+str2[2]),0)+rep);
            }
        }
        List<String> list=new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key)+" "+key);
        }
        return list;
    }
}