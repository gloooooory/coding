/**
 * Link: https://practice.geeksforgeeks.org/problems/handshakes1303/1
 * Date: 22 Dec 2021
 * Code #2
*/

import java.util.*;

class HandShakes {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            System.out.println(Solution.count(n));
        }
        kb.close();
    }
}

class Solution{
    static int count(int N) 
    { 
        if ((N & 1) == 1) {
            return 0;
        } else if (N == 0) {
            return 1;
        }
        
        int res = 0;
        
        for (int i = 0; i < N; i+=2) {
            res += count(i) * count(N - 2 - i);
        }
        
        return res;
    }
}
