package javabasics;

import java.util.stream.Stream;
import java.util.stream.Collectors;

class char_to_string {
    public static void main(String[] args) {
        char[] ch = {'P', 'r', 'o', 'g', 'r', 'a', 'm'};

        String str = Stream.of(ch)
                .map(ar -> new String(ar))
                .collect(Collectors.joining());

        System.out.println(str);
    }

}
