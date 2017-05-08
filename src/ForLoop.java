/**
 * for-loop
 * - original
 * - for-each
 * while
 */
public class ForLoop {
    public void explainForLoop() {
        String[] strings = {
                "hello", "this", "is", "Marco",
                "hello", "this", "is", "Marco",
                "hello", "this", "is", "Marco",
                "hello", "this", "is", "Marco",
                "hello", "this", "is", "Marco",
        };

        // System.out.println("hello");
        // System.out.println("this");
        // System.out.println("is");
        // System.out.println("Marco");

        // ++ operator
        // int testInt = 3;
        // testInt = testInt + 1;
        // testInt++;
        // System.out.println(testInt);

        for(int i=0; i < strings.length; i++ ) {
            System.out.println(strings[i]);
        }
    }
}
