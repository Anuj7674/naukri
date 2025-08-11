package org.example;

public class Hi {
    public void shift(int[] a) {
        int left = 0;
        int right = a.length - 1;

        for (int i = 0; i <= right; i++) {
            if (a[i] != 0) {
                continue;
            }

            while (left < right && a[right] == 0) {
                right--;
            }

            if (left < right && a[i] == 0) {
                int temp = a[i];
                a[i] = a[right];
                a[right] = temp;
                right--;  // ✅ Correct
            }
        }

        for (int j : a) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Hi h = new Hi();
        int[] arr = {0, 1, 0, 3, 12};
        h.shift(arr);
    }
}
