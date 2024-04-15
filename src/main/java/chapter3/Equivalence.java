package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 17:02
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        // false usage, should be equals, just test
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
