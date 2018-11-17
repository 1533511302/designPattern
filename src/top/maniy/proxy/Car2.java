package top.maniy.proxy;

/**
 * @author liuzonghua
 * @Package top.maniy.proxy
 * @Description: 继承的方式实现静态代理
 * @date 2018/11/17 21:57
 */
public class Car2 extends Car {
    @Override
    public void move() {
        long starttime =System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        super.move();
        long endtime =System.currentTimeMillis();
        System.out.println("汽车结束行驶，汽车行驶时间："+(endtime-starttime)+"毫秒！");

    }
}
