package keymethods;

public class MethodOverloading {
    static int myMethod ( int r, int s){
        return r+s;
    }
    static double myMethod (double X, double Y){
        return X + Y;
    }

    public static void main(String[] args) {
        int digit = myMethod(15,6);
        double value = myMethod(5.6, 7.9);
        System.out.println(+digit);
        System.out.println(+value);
    }}



