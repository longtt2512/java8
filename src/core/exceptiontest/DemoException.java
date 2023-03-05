package core.exceptiontest;

/**
 * @author long.truong@finos.asia
 */
public class DemoException {
    public static void method1(){
        method2();
    }

    public static void method2(){
        throw new ArithmeticException("method2");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("exception has been handled");
        }
    }
}
