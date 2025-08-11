package prac;

public class firstRepeating {
    public static void main(String[] args) {

        String s ="programming";
        boolean[] seen=new boolean[256];

        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(!seen[ch]){
                seen[ch]=true;

            }
            else {
                System.out.println(ch);
                break;
            }


        }
    }
}
