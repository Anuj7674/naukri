package ode;

public class secondLargest {
    public static void main(String[] args) {
        int[] a={1,2,3,0,0,8,7,5};
        int max= Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){

            if(a[i]>max){

                smax=max;
                max=a[i];
            } else if (a[i]>smax && a[i]!=max) {
                smax=a[i];
            }
        }
        System.out.println(smax);
    }
}
