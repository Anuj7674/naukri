package org.example;

import java.util.ArrayList;

public class removeDuplicate {


    public ArrayList<Integer> duplicate(int[] a){

        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<=a.length-1;i++){
            if(list.contains(a[i])){
                continue;
            }
            else {
                list.add(a[i]);
            }

        }
        return list;
    }

    public static void main(String[] args){

        removeDuplicate rd=new removeDuplicate();
        int[] b={1,2,3,4,2,3,2,1,23,4,3};
        System.out.println(rd.duplicate(b));
    }
}
