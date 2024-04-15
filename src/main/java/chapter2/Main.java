package chapter2;

/**
 * @author aLieb
 * @date 2024年04月15日 15:41
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DataOnly d = new DataOnly();
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        StaticTest.i++;

        // 静态方法直接使用类调用即可，不用创建对象
        StaticFun sf = new StaticFun();
        StaticFun.incr();
    }
}
