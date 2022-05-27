package classes.getname;

public class SomeClassName {
    public static void main(String[] args) {
        System.out.println(SomeClassName.class.getName()); // classes.getname.SomeClassName
        System.out.println(SomeClassName.class.getPackageName()); // classes.getname
        System.out.println(SomeClassName.class.getCanonicalName()); // classes.getname.SomeClassName
        System.out.println(SomeClassName.class.getSimpleName()); // SomeClassName

        System.out.println(SomeClassName.class.getSimpleName()); // SomeClassName


    }
}
