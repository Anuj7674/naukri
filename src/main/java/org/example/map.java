package org.example;

import java.util.HashMap;
import java.util.Map;

public class map {


    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("a",5);
        map.put("f",1);

        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("true");
            }
        }
    }
}
