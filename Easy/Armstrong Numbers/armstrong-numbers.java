//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String armstrongNumber(int n){
        String numStr = Integer.toString(n);
        int numc = numStr.length();
        int sum = 0;


        for(int i = 0; i < numc; i++){
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, numc);
        } 
        if(sum == n){
            return "true";
        }
        else{
            return "false";
        }
        }
    }
