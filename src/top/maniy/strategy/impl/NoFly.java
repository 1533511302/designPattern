package top.maniy.strategy.impl;

import top.maniy.strategy.FlyingStrategy;

/**
 * @author liuzonghua
 * @Package top.maniy.strategy.impl
 * @Description:
 * @date 2018/11/20 16:01
 */
public class NoFly implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("算法——不能飞行");
    }
}
