class Spreadsheet {
    Map<String, Integer> map;

    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        map.put(cell, 0);
    }
    
    public int getValue(String formula) {
        formula = formula.substring(1);
        for(int i=0;i<formula.length();i++){
            if(formula.charAt(i)=='+'){
                String s1 = formula.substring(0,i), s2 = formula.substring(i+1);
                int x = Character.isAlphabetic(s1.charAt(0))?map.getOrDefault(s1,0):Integer.parseInt(s1);
                int y = Character.isAlphabetic(s2.charAt(0))?map.getOrDefault(s2,0):Integer.parseInt(s2);
                return x+y;
            }
        }
        return 0;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */