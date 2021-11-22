/**
 * Link: https://practice.geeksforgeeks.org/problems/operating-an-array/1#
 * Date: 22nd Nov 2021
 * Code #4
*/

import java.util.*;

class OperatingAnArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-- > 0) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            int x = kb.nextInt();
            int y = kb.nextInt();
            int yi = kb.nextInt();
            int z = kb.nextInt();
            GfG g = new GfG();
            System.out.print(g.searchEle(arr, x) ? "1 " : "0 ");
            System.out.print(g.insertEle(arr, y, yi) ? "1 " : "0 ");
            System.out.println(g.deleteEle(arr, z) ? "1 " : "0 ");
        }
    }
}

class GfG
{		
	public boolean searchEle(int a[],int x)
    {
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] == x) return true;
	    }	
	    return false;
	}
	public boolean insertEle(int a[],int y,int yi)
    {
        if (yi < a.length) {
            a[yi] = y;
            return true;
        }
        return false;
	}
	public boolean deleteEle(int a[],int z)
    {
		for (int i = 0; i < a.length; i++) {
		    if(a[i] == z) {
		        a[i] = -1;
		    }
		}
		return true;
	}
}