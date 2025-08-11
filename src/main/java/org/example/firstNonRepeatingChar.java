package org.example;

public class firstNonRepeatingChar {

    public Character first(String s){

        char c=' ';
        for(int i=0;i<s.length();i++){
             c = s.charAt(i);
            int t=0;
            for(int j=0 ; j<s.length();j++){

                if(c==s.charAt(j)){
                    t++;
                }
            }
            if(t>1){
                break;
            }

        }
        return c;
    }

    public static void main(String[] args){

        firstNonRepeatingChar fr=new firstNonRepeatingChar();
        System.out.println(fr.first("Stringg"));
    }
}
