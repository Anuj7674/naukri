package prac;

import java.util.HashSet;

public class longestSubstringLength {

    public static void main(String[] args) {
        String s="qwerety";
        HashSet<Character> seen =new HashSet<>();

        int left=0; int maxLen=0;

        for(int right=0;right<s.length()-1;right++){
            while(seen.contains(s.charAt(right))){
              seen.remove(s.charAt(left));
              left++;

            }
            seen.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);

            }
        System.out.println(maxLen);
        }

    }

