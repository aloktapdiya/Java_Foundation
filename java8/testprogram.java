package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class testprogram {

    public static void main(String[] args) {

        List<String> ipv4string = List.of("201.127.0.0", "stringvalue", "127.0.0.1","localhost");
String regex = "\"^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$\"";

    Pattern p =   Pattern.compile(regex);


        for (String ipv4strings : ipv4string) {
            // Create a Matcher object that matches the sample string against the pattern
            Matcher matcher = p.matcher(ipv4strings);
            // Check if the matcher finds a match
            if (matcher.find()) {
                // If yes, print the matched string
                System.out.println("Matched: " + matcher.group());
            } else {
                // If no, print the unmatched string
                System.out.println("Unmatched: " + ipv4strings);
            }
        }



    }



}
