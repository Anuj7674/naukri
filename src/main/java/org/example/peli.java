package org.example;

public class peli {

    public  static void main(String[] args){

        peli pel =new peli();
        System.out.println(pel.pelind("MADAM"));

    }


    public boolean pelind(String s){
        int t=s.length()-1;
        for(int i = 0; i<= (s.length()-1)/2; i++){
            if(s.charAt(i)!=s.charAt(t)){
               return false;
            }
            t--;
        }
        return true;
    }
}
