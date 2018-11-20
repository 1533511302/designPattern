package top.maniy.template;

/**
 * @author liuzonghua
 * @Package top.maniy.template
 * @Description: 测试类
 * @date 2018/11/20 23:18
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("早上运动会开始");
        Games  g1=new BasketballGames();
        g1.prepareGamesTemplate();

        System.out.println("运动会结束");
        System.out.println("______________________________________________");
        System.out.println("早上运动会开始");
        Games  g2=new FootballGames();
        g2.prepareGamesTemplate();

        System.out.println("运动会结束");
    }
}
