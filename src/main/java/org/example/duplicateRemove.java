package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateRemove {


    public static void main(String args[]){

        String s="eebbgghh";

        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<=s.length()-1;i++){

            set.add(s.charAt(i));
        }
        System.out.println(set);
    }
}


