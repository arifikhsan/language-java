package access_modifier;

public class AccessProtected {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    protected void protectedMethod() {
        System.out.println("privateMethod");
    }

    public static class Reader {
        public static void main(String[] args) {
             // AccessPublic.protectedMethod(); // Cannot resolve method
        }
    }
}
