package org.example;

public class armstrong {


    public boolean amstrong(int a){
        int t=0;
        int digits= (int) Math.log10(a) +1;
        for(int i =a;i>0;i=i/10){
            int b = i%10;
            int c= (int) Math.pow(b,digits);
            t= c+t;


        }
        if(a==t) {
            return true;
        }
        else return false;
    }

    public static void main(String args[]){

        armstrong arm=new armstrong();
        System.out.println(arm.amstrong(153));
        System.out.println(arm.amstrong(123));
        System.out.println(arm.amstrong(1634));


    }
}
