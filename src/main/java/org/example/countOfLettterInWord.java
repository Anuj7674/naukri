package org.example;

import java.util.ArrayList;
import java.util.List;

public class countOfLettterInWord {


    public List<Character> count(String s){
        List<Character> list=new ArrayList<>();
        int t=0;
        for(int i =0;i<=s.length()-1;i++) {

            char a = s.charAt(i);
            if(list.contains(s.charAt(i))){
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                if (a == s.charAt(j)) {
                    t++;
                }

            }
            if (t > 1) {
                list.add(s.charAt(i));
            }
            t=0;
        }
        return list;
    }

    public static void main (String[] args){

        countOfLettterInWord c =new countOfLettterInWord();

        System.out.println(c.count("wawtrr"));
    }
}
