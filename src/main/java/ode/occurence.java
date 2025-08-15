package ode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class occurence {

    public static void main(String[] args) {
        String s= "String";


        Map<Character,Integer> map =new LinkedHashMap<>();

        for(int i =0 ; i< s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);



    }
}
