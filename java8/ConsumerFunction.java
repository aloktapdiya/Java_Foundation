package java8;

import java.util.function.Consumer;

    public class ConsumerFunction {
        public static void main(String[] args) {
            Consumer<Object> c1 = x -> System.out.println(x);
            Consumer<Object> c2 = System.out::println;

            c1.accept("Print via lambda");
            c2.accept("Print via method reference");
        }
    }
