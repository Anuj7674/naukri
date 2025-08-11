package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class reverseArray {


    public ArrayList<Integer> reverse(int[] a){
        System.out.println(a);
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i = 0; i<=a.length/2;i++){
            int temp;
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for(int num: a){
            ar.add(num);
        }

        return ar;
    }
    public static void main(String[] args){

        reverseArray ra =new reverseArray();
         int[] b=new int[]{1,2,5,6,8,5,4,5};
         for(int a:b) {
             System.out.print(a+", ");
         }
        System.out.println(ra.reverse(b));
    }
}
