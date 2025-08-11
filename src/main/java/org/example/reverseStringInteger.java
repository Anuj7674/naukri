package org.example;

public class reverseStringInteger {


    public boolean palindrome(String a){

        for(int i=0;i<=a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){

                return false;
            }
        }
            return true;
    }
public static  void main(String[] args){

        reverseStringInteger reverseStringInteger=new reverseStringInteger();
        System.out.println(reverseStringInteger.palindrome("1221"));
}
}
