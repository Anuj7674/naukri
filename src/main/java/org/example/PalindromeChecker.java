package org.example;

public class PalindromeChecker {

    /**
     * Returns true if the given phrase is a palindrome after:
     *   1. Converting all letters to lowercase, and
     *   2. Ignoring every non‑alphanumeric character.
     *
     * Time  : O(n)   (each character inspected at most once)
     * Space : O(1)   (only two indices plus a few locals)
     */
    public static boolean isPalindrome(String s) {
        int left  = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non‑alphanumeric on the left side
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non‑alphanumeric on the right side
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare normalized characters
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;                 // mismatch ⇒ not a palindrome
            }

            left++;
            right--;
        }
        return true;                            // all pairs matched
    }

    // Quick manual test
    public static void main(String[] args) {
        String[] tests = {
                "A man, a plan, a canal: Panama",
                "race a car",
                " ",
                "9",
                "No 'x' in Nixon"
        };

        for (String t : tests) {
            System.out.printf("\"%s\"  →  %b%n", t, isPalindrome(t));
        }
    }
}

