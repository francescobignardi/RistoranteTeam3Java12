package enumaration;

public enum ColoriAnsiEnum {

    //CAMBIA COLORI DI BACKGROUND E SCRITTE NEL TERMINALE
    //ColoriEnum è un Enumerato che ci permette, chiamando il colorCode, di utilizzare i codici per cambiare i colodi allo sfondo e alle scritte in output nel terminale;

    BACKGROUND_YELLOW("\u001B[43m"),
    BACKGROUND_RED("\u001B[41m"),
    BACKGROUND_GREEN("\u001B[42m"),
    BACKGROUND_BLUE("\u001B[44m"),

    BACKGROUND_CYAN("\u001B[46m"),
    BACKGROUND_BLACK("\u001B[40m"),
    BACKGROUND_PURPLE("\u001B[45m"),
    BACKGROUND_WHITE("\u001B[47m"),
    ANSI_RED("\u001B[31m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m"),
    ANSI_RESET("\u001B[0m");


    private final String color;

    ColoriAnsiEnum(String colorCode) {
        this.color = colorCode;
    }

    public String getColorCode() {
        return this.color;
    }
}