package javabasics;

import java.util.*;
    class chartostring_stringbuilder {
        public static void main(String args[]) {
            char arr[] = {'P', 'r', 'o', 'g', 'r', 'a', 'm'};

            StringBuilder st = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                st.append(arr[i]);
            }

            System.out.println(st.toString());
        }

    }
