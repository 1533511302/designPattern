package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:年轻加工厂
 * @date 2018/11/17 17:41
 */
public class YouthFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new  YouthBoy();
    }

    @Override
    public Girl getGirl() {
        return new YouthGirl();
    }
}
