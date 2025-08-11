package org.example;

import java.util.HashMap;
import java.util.Map;

public class iterqateThroughMap {


    public static void main(String args[]){


        Map<String ,Integer> map =new HashMap<>();


        map.put("String",1);
        map.put("Integer",2);

        for(Map.Entry<String , Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ "+"+ entry.getValue());

        }
    }
}
