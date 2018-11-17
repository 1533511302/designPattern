package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:年迈加工厂
 * @date 2018/11/17 17:39
 */
public class OldFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new OldBoy();
    }

    @Override
    public Girl getGirl() {
        return new OldGirl();
    }
}
