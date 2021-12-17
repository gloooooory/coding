/**
 * Link: https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1
 * Date: 17 Dec 2021
 * Code #2
*/

import java.util.*;

class NutsAndBolts {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();

            String str = kb.nextLine();
            char[] a = new char[n];

            for (int i = 0; i < n; i++) {
                a[i] = str.charAt(i);
            }

            str = kb.nextLine();
            char[] b = new char[n];

            for (int i = 0; i < n; i++) {
                b[i] = str.charAt(i);
            }
            Solution s = new Solution();
            s.matchPairs(a, b, n);

            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
        kb.close();
    }
}

class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        Map<Character, Integer> map = new HashMap<>();
        
        map.put('!', 0);
        map.put('#', 1);
        map.put('$', 2);
        map.put('%', 3);
        map.put('&', 4);
        map.put('*', 5);
        map.put('@', 6);
        map.put('^', 7);
        map.put('~', 8);
        
        char[] s = new char[]{'!', '#', '$', '%', '&', '*', '@', '^', '~'};
        
        int[] arr = new int[10];
        
        for (char ch : nuts) {
            arr[map.get(ch)]++;
        }
        
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (arr[map.get(s[i])] > 0) {
                nuts[j] = s[i];
                j++;
            }
        }
        
        for (int i = 0; i < bolts.length; i++) {
            bolts[i] = nuts[i];
        }
        
    }
}
