package top.maniy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.observer
 * @Description: 目标对象，它自动观察他的观察值，并提供注册（添加）和删除观察者的接口
 * @date 2018/11/17 22:31
 */
public class Subject {
    //用来保存注册的观察者对象
    private List<Observer> observers =new ArrayList<Observer>();

    /**
     * 添加集合中的指定观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除集合中指定观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    //  public void notifyObservers(String content){
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
            //observer.update(content);
        }
    }
}
