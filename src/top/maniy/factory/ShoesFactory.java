package top.maniy.factory;

/**
 * @author liuzonghua
 * @Package top.maniy.factory
 * @Description:鞋子工厂
 * @date 2018/11/16 16:52
 */
public class ShoesFactory {
    public ShoesInterface getShoes(String key){
        if("red".equals(key)){
            return new RedShoes();
        }else if ("Black".equals(key)){
            return  new BlackShoes();
        }
        return null;
    }

    /**
     * 根据类的名称来生产对象
     * @param className
     * @return
     */
    public ShoesInterface getShoesByClass(String className) {
        try {
            ShoesInterface shoes= (ShoesInterface) Class.forName(className).newInstance();
            return shoes;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
