package top.maniy.template;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author liuzonghua
 * @Package top.maniy.template
 * @Description: 具体子类，提供了篮球运动会的具体实现
 * @date 2018/11/20 23:15
 */
public class BasketballGames extends Games {
    @Override
    protected void game() {
        System.out.println("进行篮球比赛");
    }

    @Override
    protected void sing() {
        System.out.println("演唱歌曲");
    }


    @Override
    protected boolean isNeedSing() {
        return false;
    }
}
