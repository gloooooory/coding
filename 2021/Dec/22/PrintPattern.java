/**
 * Link: https://practice.geeksforgeeks.org/problems/print-pattern3549/1#
 * Date: 22 Dec 2021
 * Code #1
*/

import java.util.*;

class PrintPattern {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            List<Integer> list = Solution.pattern(n);

            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution{
    static List<Integer> pattern(int N){
        List<Integer> list = new ArrayList<>();
        
        int temp = N;
        
        while (temp > 0) {
            list.add(temp);
            temp -= 5;
        }
        
        if (temp <= 0) {
            list.add(temp);
            temp += 5;
        }
        
        while (temp < N) {
            list.add(temp);
            temp += 5;
        }
        
        list.add(temp);
        
        return list;
    }
}