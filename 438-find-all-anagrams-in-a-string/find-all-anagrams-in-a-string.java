class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ch[] = new int[26];
        for(int i=0;i<p.length();i++){
            ch[p.charAt(i)-'a']++;
        }
        int arr[] = new int[26];
        int in = 0, count = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';
            if(ch[idx]>0){
                if(arr[idx]<ch[idx]){
                    if(count==0) in=i; 
                } else {
                    if(count==p.length()) res.add(in);
                    while(arr[idx]>=ch[idx]){
                        arr[s.charAt(in)-'a']--;
                        count--;
                        in++;
                    }
                }
                arr[idx]++;
                count++;
            } else {
                if(count==p.length()) res.add(in);
                count = 0;
                Arrays.fill(arr,0);
            }
        }
        if(count==p.length()) res.add(in);
        return res;
    }
}