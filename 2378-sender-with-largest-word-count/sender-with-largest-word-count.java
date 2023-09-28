class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<senders.length;i++){
            int t=messages[i].split(" ").length;
            map.put(senders[i],map.getOrDefault(senders[i],0)+t);
            if(map.get(senders[i])>max){
                list.clear();
                list.add(senders[i]);
                max=map.get(senders[i]);
            } 
            else if(map.get(senders[i])==max) list.add(senders[i]);
        }
        Collections.sort(list,new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str2.compareTo(str1);
            }
        });
        return list.get(0);
    }
}