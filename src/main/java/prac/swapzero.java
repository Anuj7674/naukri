package prac;

import java.lang.reflect.Array;

public class swapzero {


    public int[] swap(int[] a) {
        int t = a.length-1;
        for (int i = 0; i <= a.length - 1; i++) {

            if (a[i] != 0) {
                continue;
            }
            while (a[t] == 0 && i < t) {
                t--;

            }
            if (a[i] == 0 && i < t) {
                if (a[t] != 0) {
                    int temp = a[i];
                    a[i] = a[t];
                    a[t] = temp;

                }

            }
        }
        return a;
    }
    public static void main(String args[]){

        int[] a= {0,2,0,4,5,6,4,5,0,0,6};
        swapzero z=new swapzero();
        z.swap(a);
        for(int q: a){
            System.out.print(q);
        }
    }

}