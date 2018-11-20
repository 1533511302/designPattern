package top.maniy.adapter;

/**
 * @author liuzonghua
 * @Package top.maniy.adapter
 * @Description: 显示器
 * @date 2018/11/19 22:45
 */
public class Display {
    private HDMI signal;

    public Display(HDMI signal){
        this.signal =signal;
    }

    //使用信号线连接显示器
    public void charge(){
        signal.HDMISignal();
    }

    public static void main(String[] args) {
        VGA vga =new VGAImpl();
        HDMI hdmi =new VGAAdapter(vga);
        Display display =new Display(hdmi);
        display.charge();

    }

}
