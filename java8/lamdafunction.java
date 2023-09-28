package java8;

import java.util.stream.IntStream;

public class lamdafunction {

    public static void main(String[] args) {

        int numbers=   IntStream.range(1,10).sum();

       System.out.println(numbers);
        //numbers.forEach(i -> System.out.println(i));

      //  n -> System.out.println("n");

        //new Thread(() -> System.out.println("Hello"));

        //() -> System.out.println();


  }
}
