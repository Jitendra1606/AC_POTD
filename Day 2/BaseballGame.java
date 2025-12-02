class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length; // storing size of string array in n
        int[] arr = new int[n]; // created a new array of integers

        int ind = 0; // initialising ind with zero

        for (int i = 0; i < n; i++) { // for loop which traverse through array operations

            String operat = operations[i]; // creating a string variable which stores ith value of String array
                                           // operation

            if (operat.equals("C")) { // checking if it is eeual to C
                ind--; // decrementing it according to rule
            } else if (operat.equals("D")) { // checking if it is eeual to D
                arr[ind] = 2 * arr[ind - 1];
                ind++; // incrementing to next index value
            } else if (operat.equals("+")) { // checking if it is eeual to +
                arr[ind] = arr[ind - 1] + arr[ind - 2];
                ind++; // incrementing to next index value
            } else {
                arr[ind] = Integer.parseInt(operat); // This converts the String to the int.
                ind++; // incrementing to next index value
            }
        }

        int sum = 0;
        for (int i = 0; i < ind; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

// Time complexity -- O(N)