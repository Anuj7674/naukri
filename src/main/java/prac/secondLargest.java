package prac;

public class secondLargest {
    public static void main(String[] args) {


        int[] a={1,2,3,4,5};
       int max=Integer.MIN_VALUE; int min=Integer.MAX_VALUE;
       int secmax=Integer.MIN_VALUE; int secmin=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){

            if(a[i]>max){
                secmax=max;
                max=a[i];

            }
            else if(a[i]>secmax && a[i]!=max){
                secmax=a[i];
            }
            if(a[i]<min){
                secmin=min;
                min=a[i];
            }
            else if(a[i]<secmin && a[i]!=min){
                secmin=a[i];
            }
        }
        System.out.println(secmax);
        System.out.println(secmin);
    }
}
