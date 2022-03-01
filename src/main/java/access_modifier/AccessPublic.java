package access_modifier;

public class AccessPublic {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static class Reader {
        public static void main(String[] args) {
            AccessPublic.main(args);
        }
    }
}

