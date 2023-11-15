package keymethods;

public class StaticNonStaticMethodParameter {
    void myMethod ( ) {
        System.out.println(" Non Static Method ");

    }
    static void myMethod ( int a){
        System.out.println(" Static Method ");
    }

    public static void main(String[] args) {
        StaticNonStaticMethodParameter obj = new StaticNonStaticMethodParameter();
        obj.myMethod();
        obj.myMethod(15 );
    }
    }


