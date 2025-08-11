package org.example;

public class numberOfWords {


    public int number(String s) {
        int t = 0;
        boolean isWord = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                if (!isWord) { // Start of a new word
                    t++;
                    isWord = true;
                }
            } else {
                isWord = false; // Reset when space is found
            }
        }
        return t;
    }


    public static void main(String[] args){
numberOfWords no =new numberOfWords();
        System.out.println(no.number(" hello world dkfj kd kdldk dlk odpo opdo   pdo "));
    }
}
