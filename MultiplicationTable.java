/**
 * Link: https://practice.geeksforgeeks.org/problems/print-table0303/1
 * Date: 15th Nov 2021
 * Code #2
 */

import java.util.*;

class GfG {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t > 0) {
            int n = kb.nextInt();
            List<Integer> list = Solution.getTable(n);
            printTable(list);
            t--;
        }
    }

    public static void printTable(List<Integer> list) {
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

class Solution{
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            list.add(N * i);
        }
        
        return list;
    }
}