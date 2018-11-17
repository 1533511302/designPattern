package top.maniy.observer;

/**
 * @author liuzonghua
 * @Package top.maniy.observer
 * @Description: 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @date 2018/11/17 22:33
 */
public class ConcreteSubject extends Subject{

    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //状态设置了 使用父类通知观察者
        this.notifyObservers();
    }
}
