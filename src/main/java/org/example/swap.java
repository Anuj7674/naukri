package org.example;

public class swap {


    public void  Swap(int a , int b){
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("Swapped value" + a +"Swapped Value" + b);

    }

    public static  void main (String[] args){
     swap swap =new swap();
        swap.Swap(12,43);

    }
}
