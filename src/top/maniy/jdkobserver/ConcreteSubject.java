package top.maniy.jdkobserver;

import java.util.Observable;

/**
 * @author liuzonghua
 * @Package top.maniy.jdkobserver
 * @Description: 目标具体实现类
 * @date 2018/11/18 16:59
 */
public class ConcreteSubject extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //通知所有股东观察者
        //注意在通知之前，在用java中Observer模式时候，下面这句不能少
        this.setChanged();
        //然后主动通知，这里先用推的方式
        this.notifyObservers(content);

        //如果是拉的方式，我们就调用
        //this.notifyObservers();//默认把整个subject传过去了
    }
}
