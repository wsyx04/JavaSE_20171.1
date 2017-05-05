package reflect.demo.b;

/**
 * Created by whb on
 * 2017/5/5 9:44
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        System.out.println("write to floppy...");
    }
}
