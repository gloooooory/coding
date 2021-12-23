/**
 * Link: https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
 * Date: 23 Dec 2021
 * Code #2
*/

import java.util.*;

class Permutation {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            String str = kb.nextLine();
            Solution s = new Solution();
            List<String> list = s.findPermutation(str);

            StringBuilder sb = new StringBuilder();
            for (String p : list) {
                sb.append(p + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {
    public List<String> findPermutation(String S) {
        int n = S.length();
        
        ArrayList<String> list = new ArrayList<>();
        return permutation(list, S, 0, n-1);
    }
    
    public ArrayList<String> permutation(ArrayList<String> list, String s, int l, int r) {
        if (l == r) {
            list.add(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permutation(list, s, l+1, r);
                s = swap(s, l, i);
            }
        }
        
        Collections.sort(list);
        return list;
    }
    
    public String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}