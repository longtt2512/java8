package core.exceptiontest;

/**
 * @author long.truong@finos.asia
 */
public class Callee {
    public void errorTest() {
        try{
            int a = 10/0;
        }finally {
            System.out.println("finally block");
        }
    }
}
