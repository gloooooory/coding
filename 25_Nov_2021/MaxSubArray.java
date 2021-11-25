/**
 * Link: https://practice.geeksforgeeks.org/problems/maximum-sub-array5443/1#
 * Date: 25th Nov 2021
 * Code #2
*/

import java.util.*;

class MaxSubArray {
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
            ArrayList<Integer> res = s.findSubarray(arr, n);

            StringBuilder sb = new StringBuilder();
            for(int i : res) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        int sum = 0, maxSum = 0;
        int j = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        List<ArrayList<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                sum += a[i];
                res.add(a[i]);
            } else {
                if (res.size() != 0) {
                    
                    if (sum > maxSum) {
                        maxSum = sum;
                        list.add(res);
                        j = list.size() - 1;
                    }
                    sum = 0;
                    res = new ArrayList<Integer>();
                }
            }
        }
        
        if (res.size() == 0) {
            res.add(-1);
        }
        
        int lastSum = 0;
        
        for(int i = 0; i < res.size(); i++) {
            lastSum += res.get(i);
        }
        
        if (lastSum > maxSum) {
            return res;
        }
        
        return (list.size() == 0 ? res : list.get(j));
    }
}