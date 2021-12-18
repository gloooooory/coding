/**
 * Link: https://practice.geeksforgeeks.org/problems/print-anagrams-together/1#
 * Date: 18 Dec 2021
 * Code #3
*/

import java.util.*;

class PrintAnagramsTogether {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        kb.nextLine();
        while(t-- > 0) {
            int n = kb.nextInt();
            String[] list = new String[n];

            for (int i = 0; i < n; i++) {
                list[i] = kb.nextLine();
            }
            Solution s = new Solution();
            List<List<String>> result = s.anagrams(list);

            StringBuilder sb = new StringBuilder();
            for (List<String> l1 : result) {
                for (String str : l1) {
                    sb.append(str + " ");
                }
                sb.append("\n");
            }

            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {
    public List<List<String>> anagrams(String[] string_list) {
        List<List<String>> list = new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        List<String> keyList = new ArrayList<>();
        
        for (String s : string_list) {
            int[] alphabets = new int[26];
            
            for (char ch : s.toCharArray()) {
                alphabets[ch - 'a']++;
            }
            
            String key = Arrays.toString(alphabets);
            
            if (!map.containsKey(key)) {
                keyList.add(key);
            }
            
            List<String> temp = map.getOrDefault(key, new ArrayList<String>());
            
            temp.add(s);
            map.put(key, temp);
        }
        
        for (String s : keyList) {
            list.add(map.get(s));
        }
        
        return list;
    }
}
