package prac;

public class removeDuplicate {


    public static void main(String[] args) {

        int index=0;
        String p="programming";
        StringBuilder br=new StringBuilder();
        for(int i=0;i< p.length();i++){
            if(br.indexOf(String.valueOf(p.charAt(i)))==-1){

               br.append(p.charAt(i));

            }
        }
        System.out.println(br);
    }
}
