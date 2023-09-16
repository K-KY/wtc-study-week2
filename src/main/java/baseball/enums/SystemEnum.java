package baseball.enums;


public enum SystemEnum {
    GAME_RESTART(1), GAME_EXIT(2);
    private final int value;
    SystemEnum(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
