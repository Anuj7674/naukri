package prac0708;

public class palindrome {
    public static void main(String[] args) {

        String s = "madamz";
        int end=s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) == s.charAt(end)) {
                end--;
            }
           else {
                System.out.println("no");
                break;
            }
        }
        System.out.println("yyes");


    }

}
