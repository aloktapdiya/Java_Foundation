package javabasics;

public class JavaMethodParameterPass {
    public int sum(int a, int b) {
        int k = a + b;
        return k;
    }

    public static void main(String [] args) {
        JavaMethodParameterPass m = new JavaMethodParameterPass();
        int result = m.sum(30, 20);
        System.out.println("sum is " + result);

    }
}