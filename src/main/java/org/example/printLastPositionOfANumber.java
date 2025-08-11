package org.example;

public class printLastPositionOfANumber {

    public void position(int[] a, int target) {
        int first = -1;
        int last = 0;
        int t = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;


            }

        }
        System.out.println("First index of target" + first);
        System.out.println("Second index of target" + last);
    }

        public static void main (String[]args){
            printLastPositionOfANumber pl = new printLastPositionOfANumber();
            int[] b = {1, 2, 2, 4, 5,1, 6, 6, 7, 5, 4,1};
            int target = 1;
            pl.position(b, target);
        }
    }
