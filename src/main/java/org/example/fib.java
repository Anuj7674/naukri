package org.example;

public class fib{

    public void fibc(int n){

        int a=0;
        int b=1;
        System.out.print(a +","+ b);

        int i=2;
        while(i<=n){
            int c=a+b;
            System.out.print(c +",");
            a=b;
            b=c;
            i++;
        }
    }
    public static void main(String args[]){

        fib f =new fib();
        f.fibc(10);
    }
}