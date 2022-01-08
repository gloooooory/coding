/**
 * Link: https://practice.geeksforgeeks.org/problems/set-bits0143/1
 * Date: 08 Jan 2022
 * Code #2
*/
// Initial Template for Java
import java.io.*;
import java.util.*;

class NumberOfOneBits {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        int count = 0;
        
        while (N != 0) {
            int result = (N & 1);
            if (result == 1) count++;
            N = (N >> 1);
        }
        
        return count;
    }
}
