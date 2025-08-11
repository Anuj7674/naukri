package org.example;

public class countVowel {

    public static void count(String s){
    int vow=0;
    int cons=0;
    for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }
            else {
                cons++;
            }
        }
        System.out.println("vow"+vow +","+ "cons"+cons);
    }

    public static void main (String[] args){
        countVowel.count("automation");
    }
}
