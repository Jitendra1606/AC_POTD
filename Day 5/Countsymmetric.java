class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int count = 0;
        for(int i = low ; i <= high ; i++){
            ArrayList<Integer> list = createlist(i);
            if(issum(list)){
                count++;
            }
        }
        return count;
    }
    //list of digits from the number
    public ArrayList<Integer> createlist(int num){
        ArrayList<Integer> list = new ArrayList<>();
        while(num > 0){
            list.add(0, num%10);
            num = num / 10;
        }
        return list;
    }
    //check if first half sum = scond half sum
    public boolean issum(ArrayList<Integer> list){
        int n = list.size(); //this list contains seperate elements(1,2,3,1)
        //only even digit number are symmetric
        if(n % 2 != 0) {
        return false;
        }
        int mid = n / 2; //breaking the list in half
        int left = 0, right = 0;

        for (int i = 0; i < mid; i++) {
            left = left + list.get(i);
        }
        for (int i = mid; i < n; i++) {
            right = right + list.get(i);
        }

        if(left == right){
            return true;
        }
        return false;
    }
}