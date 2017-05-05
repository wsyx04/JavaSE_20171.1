package reflect.demo.b;

/**
 * Created by whb on
 * 2017/5/5 9:43
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new FloppyWriter());
        service.write();
    }
}
