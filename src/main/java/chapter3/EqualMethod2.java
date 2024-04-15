package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 17:04
 */
class Value {
    int i;
}

public class EqualMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        // output: false
        // equals()方法默认比较两个对象的句柄
        System.out.println(v1.equals(v2));
    }
}
