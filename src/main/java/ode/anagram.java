package ode;

public class anagram {

    public static void main(String[] args) {


        String s="listen"; String t="simlent";

        int[] a= new int[26];
        for(int i=0;i<s.length();i++){
             a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }

        for (int i : a) {

            if (i != 0) {
                System.out.println("false");
                return;
            }
            }
        System.out.println("true");
        }

    }

