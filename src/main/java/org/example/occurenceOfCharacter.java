package org.example;

import java.util.HashMap;
import java.util.Map;

public class occurenceOfCharacter {


    public Map<Character,Integer> occur(String s){

        Map<Character,Integer> out=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(out.containsKey(s.charAt(i))){
                out.put(s.charAt(i), out.get(s.charAt(i))+1);
            }
            else{
                out.put(s.charAt(i),1);
            }

        }
       return out;
    }
    public static void main(String[] args){

        occurenceOfCharacter oc=new occurenceOfCharacter();
        System.out.println(oc.occur("HHello"));
    }
}
