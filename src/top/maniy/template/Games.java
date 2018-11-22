package top.maniy.template;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @author liuzonghua
 * @Package top.maniy.template
 * @Description: 抽象基类，为所有子类提供一个算法框架
 * @date 2018/11/20 22:59
 */
public abstract class Games {
    /**
     * 开幕式的模板方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareGamesTemplate(){
        //开幕式
        opening();
        
        //歌曲演唱
        if(isNeedSing()){
            sing();
        }

        //比赛
        game();

        //闭幕式
        closing();
    }

    /**
     * 询问用户是否需要加入演唱环节
     * Hook，钩子函数，提供一个默认或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * @return
     */
    protected boolean isNeedSing() {
        return true;
    }

    /**
     * 基本方法 闭幕式
     */
    private void closing() {
        System.out.println("运动会闭幕式");
    }

    /**
     * 抽象的基本方法，比赛
     */
    protected abstract void game();

    /**
     * 抽象的基本方法，歌唱表演
     */
    protected abstract void sing();

    /**
     * 基本方法 开幕式
     */
    private void opening() {
        System.out.println("运动会开幕式");
    }

}
