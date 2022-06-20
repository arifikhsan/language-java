package enums;

public class EnumApp {
    public static void main(String[] args) {
        var level = LevelEnum.STANDARD;
        System.out.println(level.getDescription());
        System.out.println(level.name());
        System.out.println(LevelEnum.valueOf("STANDARD"));

        for (LevelEnum levelEnum : LevelEnum.values()) {
            System.out.println(levelEnum);
        }
    }
}
