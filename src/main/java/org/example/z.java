package org.example;

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check for overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args){
        Solution sol=new Solution();
        System.out.println( sol.reverse(130));
    }
}