/**
 * Link: https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1#
 * Date: 26th Nov 2021
 * Code #3
*/

import java.util.*;

class FindDuplicatesInArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            List<Integer> list = Solution.duplicates(arr, n);

            StringBuilder sb = new StringBuilder();

            for (int i : list) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }

        kb.close();
    }
}

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int[] countArray = new int[n];
        
        for (int i = 0; i < n; i++) {
            countArray[arr[i]]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (countArray[i] > 1) {
                result.add(i);
            }
        }
        
        if (result.size() == 0) {
            result.add(-1);
        }
        
        return result;
    }
}
