package org.example;

import java.util.HashSet;
import java.util.Set;

public class printDuplicate {


    public  static void main(String [] args){

        int[] a={1,2,2,3,4,2,3,5,6,7};

        Set<Integer> added =new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        for(int i=0;i<a.length-1;i++){

            if(added.contains(a[i]))
            {
                duplicate.add(a[i]);
            }
            else{
                added.add(a[i]);
            }
        }
        System.out.println(duplicate);
    }
}
