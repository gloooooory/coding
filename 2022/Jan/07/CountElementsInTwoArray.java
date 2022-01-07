/**
 * Link: https://practice.geeksforgeeks.org/problems/counting-elements-in-two-arrays/1#
 * Date: 07 Jan 2022
 * Code #5
*/

class CountElementsIinTwoArray
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}// } Driver Code Ends



// Complete the function given below
class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       ArrayList<Integer> list = new ArrayList<>();
       
       int[] count = new int[(int)(1e5 + 1)];
       
       for (int i : arr2) {
           count[i]++;
       }
       
       int prevCount = 0;
       
       for (int i = 0; i < count.length; i++) {
           count[i] += prevCount;
           prevCount = count[i];
       }
       
       for (int i : arr1) {
           list.add(count[i]);
       }
       
       return list;
    }
}