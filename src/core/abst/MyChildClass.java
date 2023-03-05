package core.abst;

/**
 * @author long.truong@finos.asia
 */
public class MyChildClass  extends MyParentClass{

    int stest;

    public MyChildClass() {
        System.out.println("MyChildClass is printing");
    }

    public static void main(String[] args) {

        final MyChildClass childClass = new MyChildClass();
        childClass.test3();
    }

    @Override
    protected void test() {
        super.test();
    }

    public void test3(){
        System.out.println(stest);

    }
}
