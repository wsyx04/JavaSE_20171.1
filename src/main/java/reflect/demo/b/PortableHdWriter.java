package reflect.demo.b;

/**
 * Created by whb on
 * 2017/5/5 9:43
 */
public class PortableHdWriter implements DeviceWriter {

    @Override
    public void writeToDevice() {
        System.out.println("write to portable HD...");
    }
}
