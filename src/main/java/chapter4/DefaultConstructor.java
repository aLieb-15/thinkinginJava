package chapter4;

/**
 * @author aLieb
 * @date 2024年04月23日 16:35
 * 显式编写了构造方法的类，在调用时不能使用默认构造方法
 */
class Bird {
    int i;
}

class Bush {
    Bush(int i) {}
    Bush(double d){}
}

class Banana {
    void f(int i) {
        System.out.println(i);
    }
}

class Apricot {
    void pick() {
        System.out.println("pick");
    }

    void pit() {
        pick();
        System.out.println("pit");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bird nc = new Bird();
//        会报错
//        Bush b = new Bush();
        Banana a = new Banana();
        Banana b = new Banana();
        a.f(1);
        b.f(2);
    }
}
