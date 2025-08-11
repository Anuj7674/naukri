package org.example;

public class checkForPrime {

    public boolean p(int a){

        if(a<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){

            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        checkForPrime pr=new checkForPrime();
        System.out.println(pr.p(5));
    }
}
