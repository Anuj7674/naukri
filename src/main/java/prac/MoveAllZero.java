package prac;

public class MoveAllZero {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 0, 0, 9, 8, 0, 8};

        int index = 0;

        for (int i = 0; i < a.length; i++) {
              if(a[i]!=0){
                  a[index++]=a[i];

              }


        }
        for (int i = index; i < a.length; i++) {
            a[i] = 0;
        }

        for (int e : a) {
            System.out.print(e);
        }
        System.out.println();
    }
}

