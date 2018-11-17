package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:模拟客户端实现
 * @date 2018/11/16 16:42
 */
public class SunnyTest {

    public static void main(String[] args) {
        ShoesInterface red =new RedShoes();
        red.draw();

        ShoesFactory factory =new ShoesFactory();
        ShoesInterface red2 =factory.getShoes("red");
        red2.draw();

        ShoesInterface red3 =factory.getShoesByClass("top.maniy.factory.RedShoes");
        red3.draw();

        //使用年轻加工厂
        PersonFactory factory2= new YouthFactory();
        //生产年轻的女孩类
        Girl girl =factory2.getGirl();
        //调用类方法
        girl.drawWomen();
    }


}
