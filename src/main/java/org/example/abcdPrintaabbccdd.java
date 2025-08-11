package org.example;

public class abcdPrintaabbccdd {



    public String duplicate(String s , int r){
        String Word="";
        String Result="";
        for(int i =0; i<s.length(); i++){

            char ch= s.charAt(i);
            for(int j=0 ;j<r;j++){
                Word=ch+Word;
            }
           Result+=Word;
            Word="";

        }
        return Result;
    }

    public static void main(String args[]){

        abcdPrintaabbccdd av= new abcdPrintaabbccdd();
        System.out.print( av.duplicate("abcd",2));

    }
}
