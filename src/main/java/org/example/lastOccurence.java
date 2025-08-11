package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lastOccurence {

    public Map<String,Integer> occur(String s , Character target){
        Map<String,Integer> out =new HashMap<>();
        int i;
        int index=0;
        int position=0;
        char[] a=s.toCharArray();
        for(i=0;i<=a.length-1;i++){

            if(target==a[i]){
               index=i;
               position=i+1;
            }
        }
        out.put("index",index);
        out.put("position",position);

        return out;
    }

    public static void main(String args[]){

        lastOccurence o =new lastOccurence();
        System.out.println(o.occur("asadsdesd",'a'));
    }
}
