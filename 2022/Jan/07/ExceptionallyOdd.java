/**
 * Link: https://practice.geeksforgeeks.org/problems/find-the-odd-occurence4820/1#
 * Date: 07 Jan 2022
 * Code #3
*/

//Initial Template for Java

import java.io.*;
import java.util.*;

public class ExceptionallyOdd {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getOddOccurrence(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int result = 0;
        
        for (int i : arr) {
            result = result ^ i;
        }
        
        return result;
    }
}
