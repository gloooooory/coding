/**
 * Link: https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1#
 * Date: 19 Dec 2021
 * Code #3
*/

// Initial Template for Java

import java.io.*;
import java.util.*;

class FindAllFourSumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        Arrays.sort(arr);
        int n = arr.length;
        
        int l, r;
        
        for (int i = 0; i < n-3; i++) {
            if (i > 0 && arr[i] == arr[i-1]) continue;
            
            for (int j = i+1; j < n-2; j++) {
                if (j > i + 1 && arr[j] == arr[j-1]) continue;
                
                l = j+1;
                r = n-1;
                
                while (l < r) {
                    int old_l = l;
                    int old_r = r;
                    
                    if (arr[i] + arr[j] + arr[l] + arr[r] == sum) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        result.add(list);
                        
                        while (l < r && arr[l] == arr[old_l]) l++;
                        while (l < r && arr[r] == arr[old_r]) r--;
                    } else if (arr[i] + arr[j] + arr[l] + arr[r] < sum) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        
        return result;
    }
}