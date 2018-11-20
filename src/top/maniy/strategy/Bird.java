package top.maniy.strategy;

import top.maniy.strategy.impl.YesFly;

/**
 * @author liuzonghua
 * @Package top.maniy.strategy
 * @Description:
 * @date 2018/11/20 16:09
 */
public class Bird extends Animal {

    public Bird(){
        super();
        super.setFlyingStrategy(new YesFly());
    }


    @Override
    public void breathing() {
        System.out.println("我是鸟，我需要呼吸。");
    }
}
