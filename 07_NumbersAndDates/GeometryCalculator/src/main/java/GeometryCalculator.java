public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
       double a = Math.PI * (Math.pow (radius, 2));
        return a;
    }
    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double v = 4 * (Math.PI * Math.pow(radius, 3)) / 3;
        return Math.abs(v);
    }
    public static boolean isTrianglePossible(double a, double b, double c) {
        if ((a+b)>c && (a+c)>b && (b+c)>a)
        {
            return true;
        }
            return false;
        }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        double ss = Math.sqrt(s);
        return Math.abs(ss);
    }
}
