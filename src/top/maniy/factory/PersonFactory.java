package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:人物的实现接口
 * @date 2018/11/17 17:36
 */
public interface PersonFactory {

    //男孩接口
    public  Boy getBoy();

    //女孩接口
    public Girl getGirl();
}
