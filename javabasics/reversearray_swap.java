package javabasics;

class reversearray_swap {
    public static void main(String[] args) {

        // Initialize an array
        int[] arr = {10, 20, 30, 40, 50};

        // Initialize two variable
        // to traverse the array
        int left = 0, right = 4;

        // Iterate till left is
        // lesser than right
        while(left < right)
        {

            // Swap values
            int third = arr[left];
            arr[left] = arr[right];
            arr[right] = third;
            left++;
            right--;
        }

        // Print array elements
        System.out.println("The array elements are:");
        for(int index = 0 ; index < 5 ; index++)
        {
            System.out.println(arr[index]);
        }
    }
}