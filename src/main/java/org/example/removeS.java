package org.example;

public class removeS {

    public String remove(String s){
        String word="";
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }


        }

        return word;
    }

    public static void main(String[] args){
        removeS re =new removeS();
        System.out.println(re.remove("h l l o"));
    }
}

