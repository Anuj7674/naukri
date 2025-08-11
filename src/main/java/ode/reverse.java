package ode;

public class reverse
{
    public static void main(String[] args) {


        String s="This is anuj";

        StringBuilder br=new StringBuilder();

        String[] s1=s.split(" ");

        for (String string : s1) {
          br.append(Character.toUpperCase(string.charAt(0))).append(string.substring(1)).append(" ");
        }
        System.out.println(br);
    }
}
