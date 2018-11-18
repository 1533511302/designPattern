package top.maniy.observer;

/**
 * @author liuzonghua
 * @Package top.maniy.observer
 * @Description: 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @date 2018/11/17 22:36
 */
public interface Observer {
    /**
     * 更新的接口
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    public void update(Subject subject);
    //推模型 主动把某一数据推送给观察者
    //public void update(String Content);
}
