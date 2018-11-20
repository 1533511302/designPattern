package top.maniy.strategy.impl;

import top.maniy.strategy.FlyingStrategy;

/**
 * @author liuzonghua
 * @Package top.maniy.strategy.impl
 * @Description:
 * @date 2018/11/20 16:13
 */
public class YesFly implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("算法——可以飞翔！");
    }
}
