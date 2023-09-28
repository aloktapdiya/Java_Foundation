package javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMapSample {

    public static void main(String[] args) {
        List<String> numbtoStrList = new ArrayList<>();

        numbtoStrList.add("Six");
        numbtoStrList.add("Seven");
        numbtoStrList.add("Three");
        numbtoStrList.add("Two");
        numbtoStrList.add("Five");

        Map<String, Integer> map_sample = numbtoStrList.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("List : "+numbtoStrList);
        System.out.println("Map : "+map_sample);

    }

}
