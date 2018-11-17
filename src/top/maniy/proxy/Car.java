package top.maniy.proxy;

import java.util.Random;

/**
 * @author liuzonghua
 * @Package top.maniy.proxy
 * @Description:
 * @date 2018/11/17 21:51
 */
public class Car implements MoveAble{
    @Override
    public void move() {
        long starttime =System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        //实现开车的时间
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endtime =System.currentTimeMillis();
        System.out.println("汽车结束行驶，汽车行驶时间："+(endtime-starttime)+"毫秒！");
    }
}
