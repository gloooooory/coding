/**
 * Link: https://practice.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1#
 * Date: 24th Nov 2021
 * Code #3
*/

import java.util.*;

class NoOfPossibleTriangles {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            System.out.println(Solution.findNumberOfTriangles(arr, n));
        }
    }
}

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        int count = 0;
        
        Arrays.sort(arr);
        
        for (int i = n-1; i >= 2; i--) {
            int j = 0, k = i-1;
            
            while (j < k) {
                if (arr[j] + arr[k] > arr[i]) {
                    count += (k - j);
                    k--;
                } else {
                    j++;
                }
            }
        }
        
        return count;
    }
}