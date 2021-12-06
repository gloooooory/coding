/**
 * Link: https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1
 * Date: 17th Nov 2021
 * Code #5
*/

import java.util.*;

class GcdOfArray {
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
            System.out.println(s.gcd(n, arr));
        }
    }
}

class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       if (N == 1) return arr[0];
       
       int res = gcd(arr[0], arr[1]);
       
       for (int i = 2; i < N; i++) {
           res = gcd(res, arr[i]);
           
           if (res == 1) return 1;
       }
       
       return res;
    }
    
    public int gcd(int a, int b) {
        if (b == 0) return a;
        
        while (b > 0) {
            a = a % b;
            
            // swap
            int temp = a;
            a = b;
            b = temp;
        }
        
        return a;
    }
}