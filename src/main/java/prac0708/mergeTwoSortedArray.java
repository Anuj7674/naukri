package prac0708;

public class mergeTwoSortedArray {
    public static void main(String[] args) {

        int a[]={1,1,3,5,6,6};
        int b[]={1,2,4};
        int k[]= new int[a.length + b.length];
        int i=0; int j=0; int l=0;

        while(i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                k[l++] = a[i++];

            } else {
                k[l++] = b[j++];
            }
        }
            while (i<a.length){
                k[l++]=a[i++];
            }
            while (j<b.length){
                k[l++]=b[j++];
            }

        for(int p:k){
            System.out.println(p);
        }
    }
}
