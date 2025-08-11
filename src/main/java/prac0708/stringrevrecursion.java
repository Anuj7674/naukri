package prac0708;

public class stringrevrecursion {


    public static void main(String[] args){
        System.out.println( stringrevrecursion.rev("anuj"));

    }

    public static  String rev(String s){
        if(s.isEmpty()) {
            return "";
        }
            return s.charAt(s.length()-1)  +   rev(s.substring(0,s.length()-1) );



    }
}
