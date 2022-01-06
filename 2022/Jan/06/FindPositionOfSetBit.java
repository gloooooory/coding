/**
 * Link: https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1
 * Date: 06 Jan 2022
 * Code #4
*/

//Initial Template for Java

import java.io.*;
import java.util.*;

class FindPositionOfSetBit {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        String binary = Integer.toBinaryString(N);
        
        int index = 0;
        int count = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                count++;
                if (count > 1) return -1;
                index = binary.length() - i;
            }
        }
        
        return (count == 0) ? -1 : index;
    }
};
