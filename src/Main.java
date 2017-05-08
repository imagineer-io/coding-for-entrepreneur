/**
 * Created by marco on 4/26/17.
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("hello");

        // operators
        // Operators operators = new Operators();
        // operators.calculate();

        // primitive data types
        // PrimitiveDataTypes dataTypes = new PrimitiveDataTypes();
        // dataTypes.explainInteger();
        // dataTypes.explainDouble();
        // dataTypes.castNumber();
        // dataTypes.explainString();
        // dataTypes.parseData();

        // collection frameworks
        // CollectionFrameworks collectionFrameworks = new CollectionFrameworks();
        // collectionFrameworks.explainArray();
        // collectionFrameworks.explainArrayList();
        // collectionFrameworks.explainHashSet();
        // collectionFrameworks.explainHashMap();

        // if-statement
        // IfStatement ifStatement = new IfStatement();
        // ifStatement.explainBoolean();
        // ifStatement.explainIfStatement();

        // for-loop
        // ForLoop forLoop = new ForLoop();
        // forLoop.explainForLoop();
        // forLoop.explainForLoopWithArrayList();
        // forLoop.explainWhile();

        // methods
        // Methods methods = new Methods();
        // methods.testMethodOne();
        // methods.testMethodTwo("two");
        // methods.testMethodTwo("zero");
        // methods.testMethodThree();
        // System.out.println(methods.testMethodThree());
        // System.out.println(methods.testMethodFour(3, 4));

        // classes
        Classes classes = new Classes(1, 2);
        System.out.println(classes.sum());
        System.out.println(classes.multiply());
        Classes classes2 = new Classes(2, 3);
        System.out.println(classes2.sum());
        System.out.println(classes2.multiply());

        SubClasses subClasses = new SubClasses(4, 2);
        System.out.println(subClasses.sum());
        System.out.println(subClasses.multiply());
        System.out.println(subClasses.substract());
        System.out.println(subClasses.divide());
    }
}
