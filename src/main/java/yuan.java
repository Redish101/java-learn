import java.util.Random;
import java.util.Scanner;

public class yuan {
    public static void main(String[] args) {
        Random random = new Random();
        int q = random.nextInt(100);
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你要猜的数");
        while (true) {
            int a = in.nextInt();
            if (a == q) {
                System.out.println("恭喜你,猜对了！");
                break;
            }
            else {
                if (a > q) {
                    System.out.println("猜大了");
                }
                else {
                    System.out.println("猜小了");
                }
            }
        }
    }
}
