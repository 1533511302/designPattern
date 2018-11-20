package top.maniy.adapter;

/**
 * @author liuzonghua
 * @Package top.maniy.adapter
 * @Description: vga转hdmi
 * @date 2018/11/19 22:52
 */
public class VGAAdapter implements HDMI {

    private VGA vga;

    public  VGAAdapter(VGA vga){
        this.vga =vga;
    }

    @Override
    public void HDMISignal() {
        System.out.println("通过转换");
        vga.VGASignal();
    }
}
