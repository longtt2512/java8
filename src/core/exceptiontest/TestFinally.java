package core.exceptiontest;

/**
 * @author long.truong@finos.asia
 */
public class TestFinally {

    public static void main(String[] args) {
//        try {
//            TestFinally.do1();
//        } catch (Exception e) {
//            System.out.println("Exception 2");
//        }
//        TestFinally.do1();

        try {
            System.out.println("3");
            TestFinally.do1();
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("5");
            throw new RuntimeException(e);
        } finally {
            System.out.println("6");
            throw new RuntimeException();
        }
    }

    public static void do1() {
        try {
            System.out.println("1");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("2");
            throw new RuntimeException();
        } finally {
            System.out.println("finally 1");
            throw new RuntimeException("aa");
        }
    }
}
