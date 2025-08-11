package org.example;

public class reverse_word {


    public String reverse(String S){
        String word = "";
        String result=" ";
        for(int i =0 ; i<S.length();i++){
            char ch = S.charAt(i);
            if(ch!=' '){
                word= ch + word;

            }
            else {
                result += word + " ";
                word = "";
            }
        }

        result+=word + " ";
        return result;
    }

    public static void main(String args[]){
        reverse_word r = new reverse_word();

        System.out.println(r.reverse("my world is though"));
    }
}
