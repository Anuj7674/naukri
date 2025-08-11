package prac;

public class checkAnagram {
    public static void main(String[] args) {

        System.out.println(anagram("lesten","silent"));

    }
    public static Boolean anagram(String s,String t){

        int[] a=new int[256];

        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
            a[t.charAt(i)-'a']--;
        }
       for (int i=0;i<a.length;i++){
           if(a[i]==1){
               return false;
           }
       }
       return true;
    }
}
