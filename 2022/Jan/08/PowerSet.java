/**
 * Link: https://practice.geeksforgeeks.org/problems/power-set4302/1
 * Date: 08 Jan 2022
 * Code #3
*/

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class PowerSet
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        ArrayList<String> list = new ArrayList<>();
        
        int n = s.length();
        
        int size = (int) Math.pow(2, n);
        
        for (int i = 0; i < size; i++) {
            String str = "";
            
            for (int j = 0; j < n; j++) {
                int mask = 1 << j;
                
                if ((i & mask) != 0) {
                    str = str + s.charAt(j);
                }
            }
            
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        Collections.sort(list);
        return list;
    }
}
