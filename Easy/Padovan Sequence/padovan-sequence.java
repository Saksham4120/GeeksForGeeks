//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


class Solution {
    public int padovanSequence(int n) {
        final int MOD = 1000000007;

        // Handle the base cases
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }

        // Initial values for the Padovan sequence
        int p0 = 1;
        int p1 = 1;
        int p2 = 1;
        int pCurrent = 0;

        // Compute the sequence iteratively
        for (int i = 3; i <= n; i++) {
            pCurrent = (p0 + p1) % MOD;
            p0 = p1;
            p1 = p2;
            p2 = pCurrent;
        }

        return pCurrent;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int input = 193;
        int result = solution.padovanSequence(input);
        System.out.println(result); // Output the result for input 193
    }
}