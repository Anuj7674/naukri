package prac;

import java.sql.SQLOutput;

public class occurenceOfEachCharacter {
    public static void main(String[] args) {

        String s="anujanuj";
        int[] seen = new int[256];

        for(int i=0;i<s.length();i++){
           char ch =s.charAt(i);
           seen[ch]++;
        }
        for(int i=0;i<seen.length;i++){
            if(seen[i]>0){
                System.out.println((char)i + " " +seen[i] );
            }
        }
    }
}
