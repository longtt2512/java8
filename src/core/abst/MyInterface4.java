package core.abst;

/**
 * @author long.truong@finos.asia
 */
public interface MyInterface4  {

    default  void doPrint3(){
        System.out.println("asfdasdf");
    }

    static void tesst34(){
        System.out.println("dasdas");
    }
    static void tesst34(Object ass){
        System.out.println("dasdas");
    }
}
