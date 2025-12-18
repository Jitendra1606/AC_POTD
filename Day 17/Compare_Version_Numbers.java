class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int n = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < n; i++) {
            int n1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int n2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if (n1 < n2)
                return -1;
            if (n1 > n2)
                return 1;
        }
        return 0;
    }
}
// we are storing elements as string in the string array
// but to compare here we just can't compare string elements directly
// bcz string elements are compared character wise so we need to convert them
// into int first
// parseint function converts string into actual int
// now simple comparison and result
// Time Complexity -- O(Max(N,M))