package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 16:46
 */
class Number {
    int i;
}

/**
 * 演示别名，具体参见12章内容
 */
public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);

        // case 1
//        n1 = n2;
        // case 2
        n1.i = n2.i;

        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        /*
        output:
        case 1:
        1: n1.i: 9, n2.i: 47
        1: n1.i: 47, n2.i: 47
        1: n1.i: 27, n2.i: 27
        case 2:
        1: n1.i: 9, n2.i: 47
        1: n1.i: 47, n2.i: 47
        1: n1.i: 27, n2.i: 47
         */
    }
}
