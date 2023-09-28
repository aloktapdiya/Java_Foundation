package javabasics;

public class javaequals {
    public static void main(String[] args)
    {
        String grtng1 = "HELLO";
        String grtng1Cpy = "HELLO";
        String grtng2 = "ALOHA";
        String grtngObjStr =  new String("HELLO");
        System.out.println(grtng1.equals(grtng1Cpy)); /*true*/
        System.out.println(grtng1.equals(grtng2)); /*false*/
        System.out.println(grtng1.equals(grtngObjStr)); /*true*/
    }
}
