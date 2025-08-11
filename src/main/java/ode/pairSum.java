package ode;

import java.util.HashSet;
import java.util.Set;

public class pairSum {


    public static void main(String[] args) {

        int[] a={1,4,5,3,2};

        int target = 5;

        Set<Integer> set =new HashSet<>();

        for(int i:a){

            int e=target-i;
            if(set.contains(e)){
                System.out.println(i + " + "+ e);
            }
            set.add(i);
        }
    }
}
