package core.exceptiontest;

/**
 * @author long.truong@finos.asia
 */
public class Caller {

    public void doSbthing(){
        Callee callee = new Callee();
        try {
            callee.errorTest();
        }catch (Exception e){
            System.out.println("sadasd");
        }
    }

    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.doSbthing();
    }
}
