package top.maniy.observer;

/**
 * @author liuzonghua
 * @Package top.maniy.observer
 * @Description: 使用观察者模式——目标状态改变,观察者同时获取其改变状态，作出不同相应
 * @date 2018/11/17 23:05
 */
public class Client {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteSubject concreteSubject=new ConcreteSubject();

        //2.创建观察者
        ConcreteObserver concreteObserver1=new ConcreteObserver();
        concreteObserver1.setObserverName("观察者一号");
        concreteObserver1.setObserverHandle("第一种处理方式");

        ConcreteObserver concreteObserver2= new ConcreteObserver();
        concreteObserver2.setObserverName("观察者二号");
        concreteObserver2.setObserverHandle("第二种处理方式");


        //3.注册观察者
        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);

        //目标设置状态
        concreteSubject.setSubjectState("目标状态改变");
    }
}
