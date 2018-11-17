package top.maniy.proxy;

/**
 * @author liuzonghua
 * @Package top.maniy.proxy
 * @Description:
 * @date 2018/11/17 21:55
 */
public class Client {
    public static void main(String[] args) {
        Car car =new Car();
        car.move();

        MoveAble car2 =new Car2();
        car.move();

        MoveAble car3 =new Car3(car);
        car3.move();
    }
}
