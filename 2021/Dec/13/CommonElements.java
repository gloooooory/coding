/**
 * Link: https://practice.geeksforgeeks.org/problems/common-elements5420/1
 * Date: 13 Dec 2021
 * Code #3
*/

import java.util.*;

class CommonElements {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            ArrayList<Integer> list1 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list1.add(kb.nextInt());
            }

            int m = kb.nextInt();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list2.add(kb.nextInt());
            }

            Solution s = new Solution();
            ArrayList<Integer> result = s.commonElement(list1, list2);

            StringBuilder sb = new StringBuilder();
            for (int i : result) {
                sb.append(i + " ");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution{
    public static ArrayList<Integer> commonElement(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        int[] nums1 = new int[(int)(1e5+1)];
        int[] nums2 = new int[(int)(1e5+1)];
        
        for (int i : v1) {
            nums1[i]++;
        }
        
        for (int i : v2) {
            nums2[i]++;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            int b = nums2[i];
            int min = Math.min(a, b);
            for (int j = 0; j < min; j++) {
                result.add(i);
            }
        }
        
        return result;
    }
}