package top.maniy.strategy;

import top.maniy.strategy.impl.NoFly;

/**
 * @author liuzonghua
 * @Package top.maniy.strategy
 * @Description:
 * @date 2018/11/20 16:02
 */
public class Dog extends Animal {

    public Dog(){
        super();
        super.setFlyingStrategy(new NoFly());
    }

    @Override
    public void breathing() {
        System.out.println("我是狗，我需要呼吸。");
    }
}
