/**
 * Link: https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1#
 * Date: 21 Dec 2021
 * Code #5
*/

import java.util.*;

class MedianInRowSortedMatrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int r = kb.nextInt();
            int c = kb.nextInt();

            int[][] matrix = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = kb.nextInt();
                }
            }
            Solution s = new Solution();
            System.out.println(s.median(matrix, r, c));
        }
        kb.close();
    }
}

class Solution {
    int median(int matrix[][], int r, int c) {
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = (low+high)/2;
            int count = 0;
            for(int i = 0; i < r; i++) {
                count += countlessThanMid(matrix[i],mid);
            }
            if (count <= (r*c)/2) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return low;
    }
    
    int countlessThanMid(int a[],int mid){
        int l = 0, h = a.length-1; 
        while(l <= h) {
           int md = (l + h)/2; 
           if(a[md] <= mid) {
               l = md + 1;
           }
           else {
               h = md - 1;
           }
       }
       return l; 
    }
}
