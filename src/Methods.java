/**
 * function & method
 * why?
 * parameter o / x
 * return value o / x
 */
public class Methods {
    // parameter x / return value x
    public void testMethodOne() {
        System.out.println("method one");
    }
    // parameter o / return value x
    public void testMethodTwo(String str) {
        System.out.println("method " + str);
        // "method " + str;
    }
    // parameter x / return value o
    public String testMethodThree() {
        return "method three";
    }
    // parameter o / return value o
    public int testMethodFour(int a, int b) {
        return a + b;
    }
}
