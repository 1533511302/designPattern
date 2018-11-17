package top.maniy.observer;

import java.io.OutputStream;

/**
 * @author liuzonghua
 * @Package top.maniy.observer
 * @Description: 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @date 2018/11/17 22:38
 */
public class ConcreteObserver implements Observer {
    //观察者名字
    private String observerName;

    //观察者的状态
    private String  observerState;

    private String  observerHandle;

    public String getObserverHandle() {
        return observerHandle;
    }

    public void setObserverHandle(String observerHandle) {
        this.observerHandle = observerHandle;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    /**
     * 获取目标类的状态同步到观察者的状态中
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {

        observerState =((ConcreteSubject)subject).getSubjectState();
        System.out.println(observerName+"收到了:"+observerState+",处理方式"+observerHandle);
    }
}
