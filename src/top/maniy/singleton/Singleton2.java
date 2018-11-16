package top.maniy.singleton;

/**
 * @author liuzonghua
 * @Package top.maniy.singleton
 * @Description:单例模式-懒汉模式
 * 用户获取实例的时候才创建这个实例
 * 区别：饿汉模式的特点是加载类时比较慢，但是运行时获取对象的速度比较快；线程安全
 *      懒汉模式的特点是加载类时比较快，但是运行时获取对象的速度比较慢；线程不安全
 * @date 2018/11/16 10:02
 */
public class Singleton2 {
    //1.将构造方法私有化，不允许外边直接创建对象
    private Singleton2(){

    }

    //2.创建类的唯一实例,使用private static修饰
    private static Singleton2 instance;

    //3.提供一个用于获取实例的方法,使用public static修饰
    public static Singleton2 getInstance(){
        if(instance == null){//如果实例为空就创建这个实例
            instance =new Singleton2();
        }
        return instance;
    }

}
