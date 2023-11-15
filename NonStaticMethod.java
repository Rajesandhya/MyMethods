package keymethods;

public class NonStaticMethod
{ void myMethod (){
    System.out.println(" My First Non Static Method ");

}

    public static void main(String[] args) {
        NonStaticMethod obj = new NonStaticMethod();
        obj.myMethod();
    }
}
