package core.abst;

/**
 * @author long.truong@finos.asia
 */
public class ExtendedFromAbstractClass extends MyAbstractClass{

    public ExtendedFromAbstractClass() {

        System.out.println("ExtendedFromAbstractClass is printing");
    }

    public static void main(String[] args) {
        ExtendedFromAbstractClass abstractClass = new ExtendedFromAbstractClass();
    }
}
