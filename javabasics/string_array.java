package javabasics;

public class string_array {
    public static void main(String[] args)
    {
        String[] array = { "Apple", "Banana", "Orange", "Grapes", "Pineapple" };

        // First method
        for (String i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Second method
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Third method
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }
}
