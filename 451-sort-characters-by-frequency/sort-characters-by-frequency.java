class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int arr[][]=new int[map.size()][2];
        int in=0;
        for(char ch:map.keySet()){
            int fr=map.get(ch);
            arr[in][0]=ch;
            arr[in++][1]=fr;
        }
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[] a1,int a2[]){
                return a2[1]-a1[1];
            }
        });
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            char ch=(char)(arr[i][0]);
            for(int j=0;j<arr[i][1];j++) res.append(ch);
        }
        return res.toString();
    }
}