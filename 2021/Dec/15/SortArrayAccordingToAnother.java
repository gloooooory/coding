/**
 * Link: https://practice.geeksforgeeks.org/problems/relative-sorting4323/1#
 * Date: 15 Dec 2021
 * Code #4
*/

import java.util.*;

class SortArrayAccordingToAnother {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int m = kb.nextInt();
            int[] brr = new int[m];

            for (int i = 0; i < m; i++) {
                brr[i] = kb.nextInt();
            }
            Solution s = new Solution();
            int[] res = s.sortA1ByA2(arr, n, brr, m);

            StringBuilder sb = new StringBuilder();
            for (int i : res) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : A1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int[] arr = new int[N];
        int j = 0;
        
        for (int i : A2) {
            int a = map.getOrDefault(i, 0);
            
            while (a-- > 0) {
                arr[j] = i;
                j++;
                
                if (map.get(i) == 1) {
                    map.remove(i);
                } else {
                    map.put(i, map.getOrDefault(i, 0) - 1);
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            for (int i = 0; i < e.getValue(); i++) {
                list.add(e.getKey());
            }
        }
        
        Collections.sort(list);
        
        int k = 0;
        while (j < N && k < list.size()) {
            arr[j] = list.get(k);
            k++;
            j++;
        }
        
        return arr;
    }
}