package JavaThread;

import java.util.Scanner;

class ThreadInput extends Thread {
    private String mssg;

    ThreadInput(String mssg)
    {
        this.mssg = mssg;
    }
    public void run()
    {
        while (JavaThreadInputAndOutput.start == true) {
            System.out.println(this.mssg);
            try {
                Thread.sleep(1000);
            }
            catch (Exception err) {
            }
        }
    }
}
public class JavaThreadInputAndOutput {
    public static boolean start = true;
    public static void main(String[] args)
    {
        ThreadInput newThread = new ThreadInput("Manish Loves GFG!");
        newThread.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        JavaThreadInputAndOutput.start = false;
    }
}