import java.util.Scanner;

    /**
     * Created by 王洪博 on 2017/3/10.
     */
public class SwitchCase {
        public SwitchCase() {
        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D");
        String s = scanner.nextLine();

        switch (s) {
            case "A":
                System.out.println("s>90");
                break;
            case "B":
                System.out.println("s>80");
                break;
            case "C":
                System.out.println("s>60");
                break;
            case "D":
                System.out.println("s<60");
                break;
            default:
                System.out.println("default...");
                break;
        }
    }

}
