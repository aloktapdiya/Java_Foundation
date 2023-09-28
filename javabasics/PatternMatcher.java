package javabasics;


import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

        public static void main(String[] args) {
            // the input string
            String input = "*1 Rental $70,000Shopping  $299. Expenses $800 . House$2,00,000";
            // the regex pattern to match numbers with $ prepend
            String pattern = "\\$\\d+(,\\d+)*(\\.\\d+)?";
            // create a Pattern object
            Pattern p = Pattern.compile(pattern);
            // create a Matcher object
            Matcher m = p.matcher(input);
            // initialize the sum as zero
            BigDecimal sum = BigDecimal.ZERO;
            // loop through the matches
            while (m.find()) {
                // get the matched number as a string
                String num = m.group();
                // remove the $ and any commas from the number
                num = num.replace("$", "").replace(",", "");
                // convert the number to a BigDecimal object
                BigDecimal bd = new BigDecimal(num);
                // add the number to the sum
                sum = sum.add(bd);
            }
            // print the sum with $ prepend
            System.out.println("$" + sum);
        }
    }


