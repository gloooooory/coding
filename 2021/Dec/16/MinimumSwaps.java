/**
 * Link: https://practice.geeksforgeeks.org/problems/minimum-swaps/1#
 * Date: 16 Dec 2021
 * Code #1
*/

import java.util.*;

class MinimumSwaps {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            int count = s.minSwaps(arr);

            System.out.println(count);
        }
        kb.close();
    }
}

class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                int k = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = k;
                
                count++;
            }
        }
        
        return count;
    }
}