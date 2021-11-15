import java.util.Scanner;

class PrintPattern {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while (t > 0) {
            int n = kb.nextInt();
            GfG g = new GfG();
            g.printPat(n);
            System.out.println();
            t--;
        }
    }
}

class GfG
{
    void printPat(int n)
    {
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                for (int x = 1; x <= k; x++) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("$");
            k--;
        }
    }
}