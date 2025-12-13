class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String[]> list = new ArrayList();
        for(int i=0;i<code.length;i++){
            if(!isActive[i] || !code[i].matches("^[A-Za-z0-9_]+$") || businessLine[i].matches("^(?!electronics$|grocery$|pharmacy$|restaurant$).+$")) continue;
            list.add(new String[]{businessLine[i],code[i]});
        }
        list.sort(Comparator.comparing((String[] arr) -> arr[0]).thenComparing(arr -> arr[1]));
        List<String> res = new ArrayList<>();
        for (String[] arr : list) {
            res
            .add(arr[1]);
        }
        return res;
    }
}