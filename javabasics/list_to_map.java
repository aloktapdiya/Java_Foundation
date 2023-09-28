package javabasics;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

    public class list_to_map {
        public static void main(String[] args) {

            Stream<String[]>
                    strm = Stream
                    .of(new String[][] { { "ABC", "Sample" }, { "X", "Board" },
                            { "Y", "Infinity" }
                    });

            Map<String, String>
                    map_sample = strm.collect(
                    Collectors.toMap(p -> p[0], p -> p[1]));

            System.out.println("Map:" + map_sample);
        }
    }