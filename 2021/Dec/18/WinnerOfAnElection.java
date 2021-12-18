/**
 * Link: https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1#
 * Date: 18 Dec 2021
 * Code #4
*/

import java.util.*;

class WinnerOfAnElection {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            kb.nextLine();
            String[] arr = kb.nextLine().split(" ");
            String[] result = Solution.winner(arr, n);

            System.out.println(result[0] + " " + result[1]);
        }
        kb.close();
    }
}

class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        String[] result = new String[2];
        
        Map<String, Integer> map = new HashMap<>();
        
        String str = "";
        int max = -1;
        
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            
            if (max < map.get(s)) {
                max = map.get(s);
                str = s;
            } else if (max == map.get(s)) {
                if (str.compareTo(s) > 0) {
                    str = s;
                }
            }
        }
        
        result[0] = str;
        result[1] = Integer.toString(map.get(str));
        
        return result;
    }
}
