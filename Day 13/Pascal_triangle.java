class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();//declaring a list 
        for(int n = 0 ; n < numRows ; n++){
            List<Integer> row = new ArrayList<>();//declaring list for elements
            for(int r = 0 ; r <= n ; r++){
                row.add(bino(n , r));//adding values in list via function call
            }
            result.add(row);//adding all rows in list
        }
        return result;
    }
    public int bino(int n , int r){
        if(r > n || r < 0){//obvious case
            return 0;
        }
        r = Math.min(r , n - r);
        int res = 1; //learned this method from chatgpt 
        for(int i = 1 ; i <= r ; i++){ //we were doing our old method of calculating each part individually
            res = res * (n - r + i)/i;//using factorial
        }
        return res;
    }
}