package javabasics;

    public class TestRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread ended");
        }

        public static void main(String[] args) {
            TestRunnable smpl= new TestRunnable();
            Thread t1= new Thread(smpl);
            t1.start();
            System.out.println("Hello");
        }
    }