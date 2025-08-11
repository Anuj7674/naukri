package org.example;

public class stringbuffer {

    public void reverse(String s){
        StringBuilder st=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            st.append(s.charAt(i));


        }

        System.out.println(st);
    }
    public static void main(String[] args){

        stringbuffer sr=new stringbuffer();
        sr.reverse("hello");
    }
}
