package org.example;

public class removeSpaces {

    public String remove(String s){
           String res="";

           for (int i =0;i<s.length();i++){
               if(s.charAt(i)!=' '){
                   res +=s.charAt(i);
               }
           }


        return res;
    }

    public static void main(String[] args){
        removeSpaces rs = new removeSpaces();
        String input="Hello Lui";
       String output= rs.remove(input);

        System.out.println(input);
        System.out.println(output);
    }
}
