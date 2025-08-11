package org.example;

public class consecutiveArray {

    public int consecutive(int[] a){
        int c=1;
        int t=1;
        for(int i=0;i<=a.length-2;i++) {

            if (a[i] + 1 == a[i + 1]) {
                t++;
            } else {
                if ((t > c)) {
                    c = t;
                }
                t = 1;
            }
        }
        if (t > c) {
            c = t;
        }
        return c;
    }

    public static void main(String[] args){

        int[] b= {1,2,3,4};
        consecutiveArray ca=new consecutiveArray();
        System.out.println(ca.consecutive(b));
    }
}
