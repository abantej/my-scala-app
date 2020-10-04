// java singleton
public class LoggerJ {

    private static final LoggerJ INSTANCE = new LoggerJ();

    private LoggerJ() { }

    public static LoggerJ getLoggerJ() {
        return INSTANCE;
    }

    public void log(String level, String string) {
        System.out.printf("%s %s%n", level, string);
    }

    public static void main(String... args) {
        LoggerJ.getLoggerJ().log("INFO", "Everything is fine.");
    }
}

enum LoggerJEnum {

    LOGGERJ;

    public void log(String level, String string) {
        System.out.printf("%s %s%n", level, string);
    }
}
