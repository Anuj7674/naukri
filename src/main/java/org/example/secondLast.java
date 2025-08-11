package org.example;

public class secondLast {

        public static void main(String[] args) {
            int[] arr = {7, 2, 5, 1, 9, 3, 8};

            int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                // Find smallest and second smallest
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num < secondSmallest && num != smallest) {
                    secondSmallest = num;
                }

                // Find largest and second largest
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondSmallest == Integer.MAX_VALUE || secondLargest == Integer.MIN_VALUE) {
                System.out.println("Second smallest or second largest doesn't exist");
            } else {
                System.out.println("Second Smallest: " + secondSmallest);
                System.out.println("Second Largest: " + secondLargest);
            }
        }
    }


