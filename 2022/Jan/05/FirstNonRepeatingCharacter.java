/**
 * Link: https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1#
 * Date: 05 Jan 2022
 * Code #5
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class FirstNonRepeatingCharacter
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        StringBuilder sb = new StringBuilder();
        
        Queue<Character> q = new LinkedList<>();
        int[] alphabets = new int[26];
        
        for (char ch : A.toCharArray()) {
            q.add(ch);
            alphabets[ch - 'a']++;
            
            while (q.size() != 0) {
                if (alphabets[q.peek() - 'a'] > 1) {
                    q.poll();
                } else {
                    break;
                }
            }
            
            if (q.size() == 0) sb.append('#');
            else sb.append(q.peek());
        }
        
        return sb.toString();
    }
}