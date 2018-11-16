package top.maniy.singleton;

/**
 * @author liuzonghua
 * @Package top.maniy.singleton
 * @Description:单例模式Singleton
 * 应用场合：有写对象只需要一个就足够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式 类加载时候实例就加载。 形象的形容饥饿，需要快速吃，类一加载的时候实例马上加载
 * @date 2018/11/16 9:40
 */
public class Singleton {
    //1.将构造方法私有化，不允许外部直接创建对象
    private Singleton(){

    }
    //2.创建类的唯一实例,使用private static修饰
    private static Singleton instance =new Singleton();

    //3.提供一个用于获取实例的方法，使用public static修饰
    public static Singleton getInstance(){
        return instance;
    }
}
