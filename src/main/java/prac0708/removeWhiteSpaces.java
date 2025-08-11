package prac0708;

public class removeWhiteSpaces {
    public static void main(String[] args) {


        String s="ans  mfm o o ";
        StringBuilder br =new StringBuilder();

       int index=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=' '){
                br.append(s.charAt(i));
            }

        }
        System.out.println(br);
    }
}
