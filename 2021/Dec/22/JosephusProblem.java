/**
 * Link: https://practice.geeksforgeeks.org/problems/josephus-problem/1#
 * Date: 22 Dec 2021
 * Code #4
*/

import java.util.*;

class JosephusProblem {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int k = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.josephus(n, k));
        }
        kb.close();
    }
}

class Solution
{
   public int josephus(int n, int k)
    {
        if (n == 1) return 1;
        
        return (josephus(n-1, k) + (k-1)) % n + 1;
    }

}
