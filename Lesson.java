public class Lesson {

    // 1.3
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }


    // 1.4
    public static boolean task10and20(int x1, int x2) {
        if (x1 + x2 <= 20 && x1 + x2 > 10)
            return true;
        else {
            return false;
        }
    }

    //1.5
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    //1.6
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    //1.7
    public static void greetings(String Tigran) {
        System.out.println("Привет, Tigran!");
    }

    //1.8
    public static void years(int x) {
        if (x % 100 != 0 && x % 4 == 0 || x % 400 == 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не вискосный.");
        }
    }
}
