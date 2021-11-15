import java.util.*;

class SeriesGP {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while(t-- > 0) {
            int a = kb.nextInt();
            int r = kb.nextInt();
            int n = kb.nextInt();
            Solution s = new Solution();
            System.out.println(s.Nth_term(a, r, n));
        }
    }
}

class Solution
{
    public static int mod = (int)(1e9 + 7);
    
    public int Nth_term(int a, int r, int n)
    {
        long p = power(r, n-1);
        p = ((p % mod) * (a % mod)) % mod;
        return (int)(p % mod);
    }
    
    long power(long a, long b) {
        long result = 1;
        
        while (b > 0) {
            if ((b & 1) == 1) {
                result = ((result % mod) * (a % mod)) % mod;
            }
            
            a = ((a % mod) * (a % mod)) % mod;
            b = b >> 1;
        }
        
        return (result % mod);
    }
}