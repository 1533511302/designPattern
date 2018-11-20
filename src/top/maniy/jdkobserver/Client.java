package top.maniy.jdkobserver;

/**
 * @author liuzonghua
 * @Package top.maniy.jdkobserver
 * @Description:
 * @date 2018/11/18 17:14
 */
public class Client {
    public static void main(String[] args) {
        //创建一个目标，也可以说是被观察者
        ConcreteSubject subject =new ConcreteSubject();
        //创建观察者
        ConcreteObserver observer1=new ConcreteObserver();
        observer1.setObserverName("观察者一号");

        ConcreteObserver observer2=new ConcreteObserver();
        observer2.setObserverName("观察者二号");

        //注册观察者
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        //目标更新content
        subject.setContent("目标内容更新了");
    }
}
