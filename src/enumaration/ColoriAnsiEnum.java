package enumaration;

public enum ColoriAnsiEnum {

    //TODO inserire la descrizione di cosa fa
    YELLOW("\u001B[43m"),
    RED("\u001B[41m"),
    GREEN("\u001B[42m"),
    BLUE("\u001B[44m"),
    CYAN("\u001B[46m"),
    BLACK("\u001B[40m"),
    PURPLE("\u001B[45m"),
    WHITE("\u001B[47m"),
    ANSI_RESET( "\u001B[0m");

    private final String colorCode;

    ColoriAnsiEnum(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return this.colorCode;
    }

}