package core.abst;

/**
 * @author long.truong@finos.asia
 */
public class TestInterface4 implements MyInterface4{

    @Override
    public void doPrint3() {
        MyInterface4.super.doPrint3();
    }

    public static void main(String[] args) {
        MyInterface4.tesst34();
    }

}
