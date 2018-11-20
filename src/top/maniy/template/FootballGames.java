package top.maniy.template;

/**
 * @author liuzonghua
 * @Package top.maniy.template
 * @Description: 具体子类，提供了足球运动会的具体实现
 * @date 2018/11/20 23:21
 */
public class FootballGames extends Games {
    @Override
    protected void game() {
        System.out.println("进行足球比赛");
    }

    @Override
    protected void sing() {
        System.out.println("演唱“足球世界杯”歌曲");
    }
}
