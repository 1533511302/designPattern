package top.maniy.adapter;

/**
 * @author liuzonghua
 * @Package top.maniy.adapter
 * @Description: 采用继承方式的适配器
 * @date 2018/11/19 23:25
 */
public class HDMIAdapter extends HDMIImpl implements VGA  {
    @Override
    public void VGASignal() {
        this.HDMISignal();
    }
}
