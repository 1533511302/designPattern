package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:制造一双黑鞋子
 * @date 2018/11/16 16:40
 */
public class BlackShoes implements ShoesInterface {
    @Override
    public void draw() {
        System.out.println("----黑色的鞋子-----");
    }
}
