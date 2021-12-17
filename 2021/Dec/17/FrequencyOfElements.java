/**
 * Link: https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
 * Date: 17 Dec 2021
 * Code #3
*/

import java.util.*;

class FrequenceOfElements {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int p = kb.nextInt();
            Solution.frequencyCount(arr, n, p);

            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i = 0; i < N; i++) {
            arr[i] = map.getOrDefault(i+1, 0);
        }
    }
}
