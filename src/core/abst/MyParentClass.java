package core.abst;

/**
 * @author long.truong@finos.asia
 */
public class MyParentClass {
    private String name;

    public MyParentClass() {
        System.out.println("My parent class is printing");
    }

    protected  void test(){
        System.out.println("sasd");
    }

    protected  void doOverriding(){
        System.out.println("sasd");
    }
}
