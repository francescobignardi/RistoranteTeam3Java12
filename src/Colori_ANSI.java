public enum Colori_ANSI {
    YELLOW("\u001B[43m"), RED("\u001B[41m"), GREEN("\u001B[42m"), BLUE("\u001B[44m"), CYAN("\u001B[46m"), BLACK("\u001B[40m"), PURPLE("\u001B[45m"), WHITE("\u001B[47m");

    String colorCode;

    Colori_ANSI(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return this.colorCode;
    }

    public String getColor(String colorCode) {
        return Colori_ANSI.this.colorCode;
    }
}