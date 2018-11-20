package top.maniy.proxy;

/**
 * @author liuzonghua
 * @Package top.maniy.proxy
 * @Description:
 * @date 2018/11/17 21:55
 */
public class Client {
    public static void main(String[] args) {
        //普通的方式
        Car car =new Car();
        car.move();
        //继承的方式
        MoveAble car2 =new Car2();
        car.move();
        //聚合的方式
        MoveAble car3 =new Car3(car);
        car3.move();
    }
}
