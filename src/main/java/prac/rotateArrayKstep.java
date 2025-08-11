package prac;

public class rotateArrayKstep {


    public static void main(String[] args) {
        int k = 2;
        int[] b = {1, 2, 3, 4, 5};

        reverse(b, 0, b.length - 1);


        reverse(b, 0, k - 1);


        reverse(b, k, b.length-1);

      for (int h:b){
          System.out.println(h);
      }
    }



    static void reverse(int[] a , int left, int right){
            int end=right;
        while(left<right){

            int temp;
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;

          left++;
          right--;
        }
    }
}
