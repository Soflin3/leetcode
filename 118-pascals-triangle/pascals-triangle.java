class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 1 ; i <= numRows;i++){
            List<Integer> temp = new ArrayList<>();
            int first = 1;
            temp.add(first);
            for(int j = 1 ; j < i ; j++){
                first= first * (i-j);
                first=first / j;
                temp.add(first);
            }
            ans.add(temp);
        }
        return ans;
    }
}