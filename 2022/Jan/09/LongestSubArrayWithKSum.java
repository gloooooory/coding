/**
 * Link: https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1#
 * Date: 09 Jan 2022
 * Code #1
*/

import java.io.*;
import java.util.*;


class LongestSubArrayWithKSum {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}

class Solution{
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int[] prefixSum = new int[N];
        
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
        
        int res = Integer.MIN_VALUE;
        
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> list = map.getOrDefault(prefixSum[i], new ArrayList<Integer>());
            list.add(i);
            map.put(prefixSum[i], list);
        }
        
        for (int i = 0; i < N; i++) {
            if (map.containsKey(prefixSum[i] + K - A[i])) {
                for (int j : map.get(prefixSum[i] + K - A[i])) {
                    if (j >= i) {
                        res = Math.max((j-i+1), res);
                    }
                }
            }
        }
        return (res == Integer.MIN_VALUE) ? 0 : res;
    }
}
