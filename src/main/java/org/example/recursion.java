package org.example;

public  class recursion {

    public void rec(int a) {

        //     int i = a;
        if (a > 10) {
            return;
        }

        System.out.println(a);

        rec(a + 1);
    }


    public static void main(String[] args) {
        recursion rs = new recursion();
        rs.rec(1);
    }
}
