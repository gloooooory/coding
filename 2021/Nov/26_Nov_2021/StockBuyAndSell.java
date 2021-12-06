/**
 * Link: https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1#
 * Date: 26th Nov 2021
 * Code #5
*/

import java.util.*;

class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int p = 0;
            for (int i = 0; i < n-1; i++) {
                p += Math.max(0, arr[i+1] - arr[i]);
            }

            Solution s = new Solution();
            ArrayList<ArrayList<Integer>> list = s.stockBuySell(arr, n);

            if (list.size() == 0) {
                System.out.println("No profit");
            } else {
                int c = 0;
                for (int i = 0; i < list.size(); i++) {
                    c += (arr[list.get(i).get(1)] - arr[list.get(i).get(0)]);
                }

                System.out.println((c == p) ? "1" : "0");
            }
        }
    }
}

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for (int i = 1; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            
            if (A[i-1] < A[i]) {
                temp.add(i-1);
                temp.add(i);
                
                list.add(temp);
                
                temp = new ArrayList<>();
            }
        }
        
        return list;
    }
}
