import java.util.Scanner;

public class yuan {
    public static void main(String[] args) {
        double pi = 3.14;
        System.out.print("请输入圆的半径：");
        Scanner r = new Scanner(System.in);
        double s = r.nextDouble() * pi;
        System.out.println("这个圆的面积是:"+s);
    }
}
