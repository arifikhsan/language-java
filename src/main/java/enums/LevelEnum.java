package enums;

public enum LevelEnum {
    STANDARD("Standard level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    LevelEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
