package top.maniy.singleton;

/**
 * @author liuzonghua
 * @Package top.maniy.singleton
 * @Description:
 * @date 2018/11/16 9:38
 */
public class Test {
    public static void main(String[] args) {
        //饿汉模式
        Singleton s1 =Singleton.getInstance();
        //懒汉模式
        Singleton2 s2=Singleton2.getInstance();
    }
}
