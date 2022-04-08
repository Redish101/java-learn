import java.util.Scanner;

public class yuan {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("输入圆柱体的h:");
        double h = input.nextDouble();
        System.out.print("输入圆柱体底面的r：");
        double r = input.nextDouble();
        System.out.printf("圆柱体的表面积为：%.2f%n", 2*pi*r*h+pi*r*r*2);
    }
}
