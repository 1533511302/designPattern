package top.maniy.strategy;

/**
 * @author liuzonghua
 * @Package top.maniy.strategy
 * @Description: 所有的动物都要继承此类
 * 抽象了动物的行为：呼吸
 * @date 2018/11/20 15:55
 */
public abstract class Animal {
    //呼吸
   public abstract void breathing();
    //将飞行行为抽象为接口，在父类中持有该接口，并由该接口代理飞行行为
    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void fly(){
        flyingStrategy.performFly();
    }
}
