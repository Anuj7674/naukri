package prac0708;

public class TitleCase {
    public static void main(String[] args) {

        String s = "this is anuj";
        StringBuilder br=new StringBuilder();
        String[] str=s.split(" ");
        String word=" ";
        for(int i=0;i<str.length;i++){
             word=str[i];
             word= String.valueOf(Character.toUpperCase(word.charAt(0)) + word.substring(1));
            br.append(word).append(" ");
        }
        System.out.println(br);
    }
}
