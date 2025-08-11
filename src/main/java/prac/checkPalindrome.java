package prac;

public class checkPalindrome {
    public static void main(String[] args) {


        System.out.println(check("madam"));
        System.out.println(check(121));

    }
    static Boolean check(String s){
            int right=s.length()-1;
        for(int left=0;left<s.length();left++){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
        }
      return true;
    }

    static Boolean check(int s){
         int newa=0;
        for(int i=s;i>0;i=i/10){
            int a=i%10;
             newa =newa*10+a;

        }
        if(newa==s){
            return true;
        }
       return false;
        }
    }



