class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; // value
            return a[1] - b[1];                  // index
        } 
    );
        for(int i = 0 ; i < n ; i++){
            pq.offer(new int[]{nums[i] , i});//creating a piority queue which accept elements as a pair
        }
        boolean[] marked = new boolean[n];

        for (int i = 0; i < n; i++) {
            marked[i] = true; // initially marks all element as true
        }
        long sum = 0;
        while(!pq.isEmpty()){
           int[] cur = pq.poll();
           int val = cur[0];
           int ind = cur[1];
           if(!marked[ind]){
              continue;//if that value is already false then don't do anything and skip everything below it
           }
           sum = sum + val;
           marked[ind] = false;
           if(ind - 1 >= 0) marked[ind - 1] = false;
           if(ind + 1 < n) marked[ind + 1] = false;
        }
        return sum;
    }
}