package chapter3;

/**
 * @author aLieb
 * @date 2024年04月15日 16:52
 */
class Letter {
    char c;
}

public class PassObject {
    public static void f(Letter y) {
        y.c = 'z';
    }


    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
        /*
        output:
        1: x.c: a
        2: x.c: z
        */
    }
}
