package top.maniy.jdkproxy;

import sun.security.jca.GetInstance;
import top.maniy.proxy.Car;
import top.maniy.proxy.MoveAble;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author liuzonghua
 * @Package top.maniy.jdkproxy
 * @Description: JDK动态代理
 * @date 2018/11/17 22:12
 */
public class Test {
    public static void main(String[] args) {
        Car car =new Car();

        InvocationHandler h =new TimeHandler(car);
        Class<?> cls =car.getClass();
        /**
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandler
         */
        MoveAble m =(MoveAble) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);

        m.move();
    }
}
