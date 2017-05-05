package reflect.demo.b;

/**
 * Created by whb on
 * 2017/5/5 9:43
 */
//强耦合---松散耦合---》解耦
public class Service {
    private DeviceWriter deviceWriter;

    public Service(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
