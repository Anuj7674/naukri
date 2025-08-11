package org.example;

import java.util.HashMap;
import java.util.Map;

public class countOfString {

    public Map<Character , Integer> count(String s){
        Map<Character , Integer> characterCount=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if (characterCount.containsKey(s.charAt(i))){
                characterCount.put(s.charAt(i),characterCount.get(s.charAt(i))+1);
            }
            else{
                characterCount.put(s.charAt(i),1);
            }


        }

        return characterCount;
    }

    public static  void main (String[] args){
        countOfString cs =new countOfString();
        System.out.println(cs.count("suppper"));
    }
}
