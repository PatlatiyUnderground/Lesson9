import java.util.Scanner;

public class Main {

    static int a = 0;
    static boolean b = false;

    public static void main(String[] args) {
        a = number();
        b = check();
        print();
    }

    public static int number() {
        System.out.println("Введите число");
        return new Scanner(System.in).nextInt();
    }

    public static boolean check() {
        return a % 2 == 0;
    }

    public static void print() {
        System.out.println(b);
    }

}
