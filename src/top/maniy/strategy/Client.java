package top.maniy.strategy;

/**
 * @author liuzonghua
 * @Package top.maniy.strategy
 * @Description: 策略模式测试类
 * @date 2018/11/20 16:14
 */
public class Client {
    public static void main(String[] args) {
        Animal dog =new Dog();
        dog.breathing();
        dog.fly();

        Animal bird =new Bird();
        bird.breathing();
        bird.fly();

    }
}
