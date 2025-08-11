package ode;

public class movveZero {

    public static void main(String[] args) {

        int[] a={1,2,3,0,0,8,7,5};
        int ind=0;
        for(int i=0 ;i<a.length;i++){

            if(a[i]!=0){

                a[ind++]=a[i];

            }

        }
        while(ind<a.length){
            a[ind++]=0;
        }
        for(int b:a){
            System.out.println(b);
        }
    }
}
