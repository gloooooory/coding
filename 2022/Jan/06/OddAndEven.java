/**
 * Link: https://practice.geeksforgeeks.org/problems/help-nobita0532/1#
 * Date: 06 Jan 2022
 * Code #1
*/

import java.util.*;

class OddAndEven {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.oddEven(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String oddEven(String S) {
        int[] alphabets = new int[26];
        
        for (char ch : S.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        
        int x = 0, y = 0;
        
        for (int i = 0; i < alphabets.length; i++) {
            if ((i+1) % 2 == 0 && alphabets[i] != 0 && alphabets[i] % 2 == 0) {
                x++;
            } else if ((i+1) % 2 != 0 && alphabets[i] % 2 != 0) {
                y++;
            }
        }
        
        String result = "";
        
        if ((x + y) % 2 == 0) {
            result = "EVEN";
        } else {
            result = "ODD";
        }
        
        return result;
    }
}
