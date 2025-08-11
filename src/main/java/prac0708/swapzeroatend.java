package prac0708;

public class swapzeroatend {
    public static void main(String[] args) {


        int[] a={0,0,8,7,6,8,9};
        int ind=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[ind++]=a[i];
            }
        }
        while(ind<a.length){
            a[ind]=0;
            ind++;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
