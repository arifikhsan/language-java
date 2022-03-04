package optional;

import java.util.Optional;

public class OptionalNull {
    public static void main(String[] args) {
        var name = Optional.ofNullable(getName());
        boolean isStartWithI = name.orElse("i").startsWith("i");
//        name = name.orElse("sdf");
        System.out.println(isStartWithI);
    }

    private static String getName() {
        return null;
    }
}
