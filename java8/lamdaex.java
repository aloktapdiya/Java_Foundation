package java8;

public class lamdaex {

    public static void main(String[] args) {





        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable");
            }
        };
    }

    Runnable r1 = () -> System.out.println("My Runnable");


}
