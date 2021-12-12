/**
 * Link: https://practice.geeksforgeeks.org/problems/magnet-array-problem3743/1#
 * Date: 11 Dec 2021
 * Code #4
*/

import java.util.*;

class MagnetArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            double[] arr = new double[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextDouble();
            }

            double[] ans = new double[n-1];
            Solution s = new Solution();
            s.nullPoints(n, arr, ans);

            StringBuilder sb = new StringBuilder();

            for (double d : ans) {
                sb.append(String.format("%.2f", d) + ", ");
            }
            
            System.out.println(sb.toString());
        }
        kb.close();
    }
}

class Solution {
    
    public void nullPoints(int n, double magnets[], double getAnswer[])
    {
        if (n == 2) {
            getAnswer[0] = (magnets[0] + magnets[1])/2;
            return;
        }
        
        for (int i = 0; i+1 < magnets.length; i++) {
            getAnswer[i] = getNullForce(i, i+1, magnets);
        }
    }
    
    public double getNullForce(int left, int right, double[] m) {
        double low = m[left];
        double high = m[right];
        double mid = (low + high) / 2;
        double pf = 0.0, nf = 0.1;
        
        
        while (Math.abs(pf - nf) >= 0.000001) {
        
            pf = 0.0; nf = 0.0;
            for (int i = 1; i <= right; i++) {
                pf += 1 / (mid - m[i-1]);
            }
            
            for (int i = m.length - 1; i > left; i--) {
                nf += 1 / (m[i] - mid);
            }
            
            if (pf > nf && Math.abs(pf - nf) >= 0.000001) {
                low = mid;
                mid = (low + high) / 2;
            } else if (pf < nf && Math.abs(pf - nf) >= 0.000001) {
                high = mid;
                mid = (low + high) / 2;
            } else {
                break;
            }
        }
        
        return mid;
    } 
}
