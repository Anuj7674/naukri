package prac;

public class StringCompression {




        public static void main(String[] args){
            int i;
            StringBuilder br =new StringBuilder();
            String s="abvcdddcvv";
            int Count=1;
            for( i=1 ; i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    Count ++;
                }
                else {
                    br.append(s.charAt(i-1)).append(Count);
                    Count=1;
                }
            }
            br.append(s.charAt(i-1)).append(Count);
            System.out.println(br);
       }
}
