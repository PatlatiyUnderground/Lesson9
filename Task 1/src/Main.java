import java.util.Objects;
import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;
    static double c = 0;
    static String proc = "0";


    public static void main(String[] args) {
        a = inputDouble();
        b = inputDouble();
        proc = inputString();
        calculator();
        print();
    }



    private static void divide() {
        c = a / b;
    }

    private static void diff() {
        c = a - b;
    }

    private static void multiply() {
        c = a * b;
    }

    private static void sum() {
       c = a + b;
    }


    private static double inputDouble() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextDouble();
    }

    private static String inputString() {
        System.out.println("Введите действие: (+, -, * или /)");
        return new Scanner(System.in).nextLine();
    }

    private static void print() {
        System.out.println("Результат равен: " + c);
    }

    private static void calculator() {
        if (Objects.equals(proc, "+")) {
            sum();      //Метод суммирования чисел
        } else if (Objects.equals(proc, "-")) {
            diff();     //Метод вычитания чисел
        } else if (Objects.equals(proc, "*")) {
            multiply(); //Метод умножения чисел
        } else if (Objects.equals(proc, "/")) {
            divide();   //Метод деления чисел
        } else System.out.println("Error");

    }
}
