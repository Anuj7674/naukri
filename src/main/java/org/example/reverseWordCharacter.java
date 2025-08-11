package org.example;

public class reverseWordCharacter {

     public String reverse(String s)
     {
         String word="";
         String result="";

         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch!=' '){
                 word=ch + word;
             }
             else {
                 result+=word + " ";
                 word="";
             }
         }
        result+=word;
         return result;
     }
     public static void main(String args[]){

         reverseWordCharacter rs =new reverseWordCharacter();
         System.out.println(rs.reverse("my wddvorld gscsot xxx udcvp"));
     }
    }


