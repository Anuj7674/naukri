package org.example;

public class shiftZero {

    public void shift(int[] a){
        int t=a.length-1;
        for(int i =0;i<a.length;i++){


            if(a[i]!=0){
             continue;
            }

            while(i<t && a[t]==0){
                t--;
            }
            if(a[i]==0 && i<t){

                {
                    if(a[t]!=0){
                        int temp;
                        temp=a[t];
                        a[t]=a[i];
                        a[i]=temp;
                    }
                }

            }
        }
        for(int b:a){
            System.out.print(b);
        }
    }
    public static void main(String[] args){

        shiftZero s=new shiftZero();
        int[] b={1,0,8,9,0,7,5,6,0,0};
        s.shift(b);
    }
}
