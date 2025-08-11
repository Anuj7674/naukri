package prac0708;

public class countString {

    public static void main(String[] args) {


        String s= "annnujjj";

        int[] a=new int[256];

        for(int i =0;i<s.length();i++){

            a[s.charAt(i)]++;
        }

//        for(int i=0;i<a.length-1;i++){
//            if(a[i]>0){
//                System.out.println((char)i +" "+ a[i]);
//            }
//        }

//        boolean[] print= new boolean[256];

        for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
            if(a[ch]>2){
                System.out.println(ch + " "+ a[ch]);
                break;
//                print[ch]=true;
            }
        }
    }


}
