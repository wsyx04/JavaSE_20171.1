package reflect.demo.a;

/**
 * Created by whb on
 * 2017/5/5 9:04
 */
//高层应用类
    //强耦合
public class Service {
    private FloppyWriter floppyWriter;
    public void write() {
        floppyWriter = new FloppyWriter();
        floppyWriter.writeToFloppy();
    }
}
