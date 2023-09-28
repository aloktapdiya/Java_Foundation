package javabasics;

import java.util.*;

class HelloWorld {


    // function that reverses array and stores it
    // in another array
    static void reverseTheArray(int arr[], int n)
    {

        // Declare an auxiliary array
        int[] auxiliary = new int[n];

        int j = n;
        for (int i = 0; i < n; i++) {

            // Fill the auxiliary array
            auxiliary[j - 1] = arr[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("The array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(auxiliary[i]);
        }
    }

    public static void main(String[] args) {

        // Initialize an array
        int [] arr = {10, 20, 30, 40, 50};
        reverseTheArray(arr, arr.length);

    }
}
