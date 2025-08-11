package prac;

import org.apache.commons.math3.analysis.function.Min;

public class largestSmallest {


    public int[] secondlargest(int[] a){

        int secondLargest= Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int smallest=Integer.MAX_VALUE;
//           int num=a.length-1;
        for(int num : a){

            if(num<smallest){
                secondSmallest=smallest;
                smallest=num;

            }
            else if(num<secondSmallest && num!=smallest){
               secondSmallest=smallest;
            }

        }
        System.out.println(secondSmallest);
        return a;
    }
    public static void main(String[] args){

        largestSmallest l=new largestSmallest();
        int a[]= {1,2,3,5,6,78,7,65};
        l.secondlargest(a);
    }
}
