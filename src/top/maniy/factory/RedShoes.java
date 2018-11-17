package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:制造一个红色鞋子
 * @date 2018/11/16 16:37
 */
public class RedShoes implements ShoesInterface {
    @Override
    public void draw() {
        System.out.println("----红色的鞋子----");
    }
}
