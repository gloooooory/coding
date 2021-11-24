/**
 * Link: https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1#
 * Date: 24th Nov 2021
 * Code #4
*/

import java.util.*;

class LeadersInArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            ArrayList<Integer> list = Solution.leaders(arr, n);

            StringBuilder sb = new StringBuilder();
            for(int i : list) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
    }
}

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[n-1]);
        int max = arr[n-1];
        
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] >= max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        
        return res;
    }
}
